package com.cms.product.constant;

public enum  RestfullType {

    NONE(0,"无操作"),
    PUT(1,"更新"),
    POST(2, "添加"),
    DLETE(3, "删除"),
    GET(4, "查询");

    private int code;
    private String value;

    private RestfullType(int code, String value) {
        this.value = value;
        this.code = code;
    }
}
