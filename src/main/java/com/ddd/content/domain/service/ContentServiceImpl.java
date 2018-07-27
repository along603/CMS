package com.ddd.content.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ddd.content.controller.dto.ContentDto;
import com.ddd.content.domain.bean.ContentAgg;
import com.ddd.content.domain.event.ContentEvent;
import com.ddd.content.domain.event.ContentEventListener;
import com.ddd.content.domain.factory.ContentFactory;
import com.ddd.content.repository.ContentRepository;

public class ContentServiceImpl {

    /*
	 * 调用该方法前，应当先经过proxy进行xml解析，封装成dto，并且如果assetID为系统生成，
	 * �先生成新的assetID
	 * */
    @Autowired
    ContentFactory factory;

    @Autowired
    ContentRepository repository;
    @Autowired
    List<ContentEventListener> listenerList;

    public ContentAgg addContent(ContentDto dto) {
        ContentAgg content = factory.create(dto);
        if (content.getId() != null) {
            return content;
        }
        content = repository.save(content);
        if (content.getStatus() == 0) {
            fireContentEvent(content, ContentEvent.ADD_CONTENT_AUDIT);
        } else {
            fireContentEvent(content, ContentEvent.ADD_CONTENT_INJECT);
        }
        return content;
    }

    public void fireContentEvent(ContentAgg change, int id) {
        ContentEvent event = new ContentEvent(change);
        for (ContentEventListener listener : listenerList) {
            switch (id) {
                case ContentEvent.ADD_CONTENT_INJECT:
                    listener.contentAdd(event);
                    break;
                default:
                    break;
            }
        }
    }
    /*//通过依赖注入模式更能满足我们当下�?�?
	public void addContentEventListener(ContentEventListener listener){
		listenerList.add(listener);
	}	
	public void removeContentEventListener(ContentEventListener listener){
		if(listener!=null){
			listenerList.remove(listener);
		}
	}
     */
}
