package com.ddd.content.controller.dto;

import java.util.List;

import com.ddd.content.domain.bean.AbstractPhysicalFile;

public class ContentDto {

    private String assetId;
    private List<AbstractPhysicalFile> files;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public List<AbstractPhysicalFile> getFiles() {
        return files;
    }

    public void setFiles(List<AbstractPhysicalFile> files) {
        this.files = files;
    }

}
