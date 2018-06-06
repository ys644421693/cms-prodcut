package com.cms.product.constant;

public enum ComponentType {

    TEXT(0,"普通文本"),
    BUTTON(1, "按钮"),
    A(2, "A标签"),
    INPUT_TEXT(3, "输入框文本"),
    DIALOG(4,"弹窗");

    private int code;
    private String value;

    private ComponentType(int code, String value) {
        this.value = value;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
