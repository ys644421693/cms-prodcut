package com.cms.product.component;


import com.cms.product.constant.ComponentType;

import javax.persistence.*;

@Entity
@Table(name = "t_cms_table_column")
public class TableColumnComponent {
    //tableId
    private long columnId;
    //属性对应名称
    private String keyName;
    //别名
    private String alias;
    //组件类型
    private ComponentType componentType;
    //样式组
    private String classNames;
    //列排布序号
    private int sortId;
    //componentId 组件类型
    private long componentId;
    //是否使用数据名称
    private boolean isDataName;
    //是否支持排序
    private boolean isSort;
    //占多少列
    private int colSpan;
    //占多少行
    private int rowSpan;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getColumnId() {
        return columnId;
    }

    public void setColumnId(long columnId) {
        this.columnId = columnId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public long getComponentId() {
        return componentId;
    }

    public void setComponentId(long componentId) {
        this.componentId = componentId;
    }

    public boolean isDataName() {
        return isDataName;
    }

    public void setDataName(boolean dataName) {
        isDataName = dataName;
    }

    public boolean isSort() {
        return isSort;
    }

    public void setSort(boolean sort) {
        isSort = sort;
    }

    public int getColSpan() {
        return colSpan;
    }

    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }

    public int getRowSpan() {
        return rowSpan;
    }

    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }
}
