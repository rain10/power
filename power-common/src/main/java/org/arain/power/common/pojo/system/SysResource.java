package org.arain.power.common.pojo.system;

public class SysResource {
    private Long id;

    private Short enabled;

    private String icon;

    private String name;

    private Long pid;

    private Integer sort;

    private String url;

    private Long system;

    private String type;

    private Short authorization;

    private Short havemune;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getSystem() {
        return system;
    }

    public void setSystem(Long system) {
        this.system = system;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Short getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Short authorization) {
        this.authorization = authorization;
    }

    public Short getHavemune() {
        return havemune;
    }

    public void setHavemune(Short havemune) {
        this.havemune = havemune;
    }
}