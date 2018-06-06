package com.cms.product.component;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_cms_table")
public class TableComponent {

    private long tableId;
    private String className;
    private String tableHead;
    private Set<TableColumnComponent> tableColumnComponents;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableHead() {
        return tableHead;
    }

    public void setTableHead(String tableHead) {
        this.tableHead = tableHead;
    }

    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinColumn(name = "tableId")
    public Set<TableColumnComponent> getTableColumnComponents() {
        return tableColumnComponents;
    }

    public void setTableColumnComponents(Set<TableColumnComponent> tableColumnComponents) {
        this.tableColumnComponents = tableColumnComponents;
    }
}
