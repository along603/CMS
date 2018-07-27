package com.ddd.content.domain.bean;

import java.util.List;

public abstract class AbstractPhysicalFile {

    public List<Object> storageInfo;
    public String assetId;
    public String name;
    public String fileType;
    public int status;
    public String serviceCode;

    public abstract boolean inject();

    public int getStatus() {//由注入方主动上报，或者定期扫描更�?
        return status;
    }

    public abstract boolean cancel();

    public abstract boolean delete();

    public List<Object> getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(List<Object> storageInfo) {
        this.storageInfo = storageInfo;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
