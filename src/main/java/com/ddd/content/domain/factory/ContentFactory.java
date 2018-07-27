package com.ddd.content.domain.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddd.content.controller.dto.ContentDto;
import com.ddd.content.domain.bean.ContentAgg;
import com.ddd.content.domain.bean.ContentTypeVO;
import com.ddd.content.domain.bean.AbstractPhysicalFile;
import com.ddd.content.domain.service.PolicyService;
import com.ddd.content.repository.ContentRepository;

public class ContentFactory {
	@Autowired
	ContentRepository repository; 
	@Autowired
	PolicyService policy;
	public ContentAgg create(ContentDto dto){
		//幂等,同assetId不允许多次添加
		ContentAgg content = repository.findByAssetID(dto.getAssetId());
		if(content!=null){
			return content;
		}
		content = new ContentAgg();
		//复制属性
		if(content.getContentType()!=ContentTypeVO.CHANNEL.getValue()){
			//根据Dto中的内容类型进行注入策略选择,存储节点选择
			for(AbstractPhysicalFile file:content.getFiles()){
				List<Object> storages = policy.getStorageInfo(file);
				file.setStorageInfo(storages);
			}
		}
		//是否需要审核		
		return content;
	}
}
