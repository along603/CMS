package com.ddd.content.domain.bean;

import java.util.List;

public class ContentAgg {//消费最小颗粒
	public Long id;
	public String providerId;
	public String assetId;//channelcode/packagetitleassetid
	public int contentType;//movie/app/channel
	public String contentName;
	public MeteData meteData;
	public int status;
	public List<AbstractPhysicalFile> files;//assetType + poster/preview
	public int update(){
		//file update//执行注入与删除/取消注入过程
		//price update
		if(status == 99){//删除或注销时，修订相关的商品，产品，内容包
			//pull到消息中间件中
			//package update
			//p update
			//po update
		}
		return 0;
	}
	public ContentAgg get(String assetId){
		return this;
	}
	public List<AbstractPhysicalFile> getFiles() {
		return files;
	}
	public void setFiles(List<AbstractPhysicalFile> files) {
		this.files = files;
	}
	public int getContentType() {
		return contentType;
	}
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
