package com.ddd.content.domain.bean;

public class MovieEntity extends AbstractPhysicalFile {

    public String playUrl;

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    @Override
    public boolean inject() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean cancel() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "Movie [playUrl=" + playUrl + ", storageInfo=" + storageInfo
                + ", assetId=" + assetId + ", name=" + name + ", fileType="
                + fileType + ", status=" + status + "]";
    }
}
