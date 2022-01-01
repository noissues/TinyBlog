package com.tinyblog.springboot.mybatis.model;

public enum BlogStatus {
    DRAFT(0),
    PUBLISHED(1),
    DELETED(2);
    
    private int status;
    
    private BlogStatus(int status) {
        this.status = status;
    }
}
