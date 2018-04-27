package com.cms.product.page;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_cms_page_framework")
public class PageFrameworkOrm implements Serializable {

    private long id;
    private String name;
    private int col;
    private int index;
    private String cell;
    private PageFrameworkOrm parentId;
    private Set<PageFrameworkOrm> children = new HashSet<PageFrameworkOrm>();

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

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    /**父组织*/
    @ManyToOne
    @JoinColumn(name="parentId")
    public PageFrameworkOrm getParentId() {
        return parentId;
    }

    public void setParentId(PageFrameworkOrm parentId) {
        this.parentId = parentId;
    }

    /**子组织*/
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="parentId")
    public Set<PageFrameworkOrm> getChildren() {
        return children;
    }

    public void setChildren(Set<PageFrameworkOrm> children) {
        this.children = children;
    }


}
