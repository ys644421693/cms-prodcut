package com.cms.product.page;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t_cms_js_group")
public class JsGroupOrm {

    private long id;
    private String name;
    private String flag;
    private String jsCode;
    private Set<PageOrm> pageOrmSet;
    private Date createTime;
    private Date updateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Column(length = 2000)
    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }

    @ManyToMany
    @Cascade(value= {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinTable(name = "t_cms_page_js_m",joinColumns={@JoinColumn(name="jsId")},inverseJoinColumns = {@JoinColumn(name = "pageId")})
    public Set<PageOrm> getPageOrmSet() {
        return pageOrmSet;
    }

    public void setPageOrmSet(Set<PageOrm> pageOrmSet) {
        this.pageOrmSet = pageOrmSet;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
