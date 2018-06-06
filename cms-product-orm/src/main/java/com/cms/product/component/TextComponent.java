package com.cms.product.component;

import javax.persistence.*;

@Entity
@Table(name = "t_cms_text")
public class TextComponent {

    //文本id
    private long textId;
    //样式组
    private String classNames;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getTextId() {
        return textId;
    }

    public void setTextId(long textId) {
        this.textId = textId;
    }

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames;
    }
}
