package com.cms.product.component;

import com.cms.product.constant.ComponentType;
import com.cms.product.constant.RestfullType;
import com.management.app.orm.ResourceVo;

import javax.persistence.*;

@Entity
@Table(name = "t_cms_button")
public class ButtonComponent {

    //按钮id
    private long buttonId;
    //属性对应名称
    private String keyName;
    //别名
    private String alias;
    //服务类型
    private RestfullType restfullType;
    //服务
    private ResourceVo resourceVo;
    //按钮样式
    private String className;
    //事件标识 function(flag,data); 为空则普通操作
    private String eventFlag;
    //外部组件
    private long componentId;
    //一般只用弹窗
    private ComponentType componentType;
    //操作告警信息
    private String warningInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getButtonId() {
        return buttonId;
    }

    public void setButtonId(long buttonId) {
        this.buttonId = buttonId;
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

    public RestfullType getRestfullType() {
        return restfullType;
    }

    public void setRestfullType(RestfullType restfullType) {
        this.restfullType = restfullType;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public ResourceVo getResourceVo() {
        return resourceVo;
    }

    public void setResourceVo(ResourceVo resourceVo) {
        this.resourceVo = resourceVo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEventFlag() {
        return eventFlag;
    }

    public void setEventFlag(String eventFlag) {
        this.eventFlag = eventFlag;
    }

    public long getComponentId() {
        return componentId;
    }

    public void setComponentId(long componentId) {
        this.componentId = componentId;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    public String getWarningInfo() {
        return warningInfo;
    }

    public void setWarningInfo(String warningInfo) {
        this.warningInfo = warningInfo;
    }
}
