package com.ddd.content.domain.bean;

public enum ContentTypeVO {
    MOVIE(1), CHANNEL(4);
    private int value;

    private ContentTypeVO(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
