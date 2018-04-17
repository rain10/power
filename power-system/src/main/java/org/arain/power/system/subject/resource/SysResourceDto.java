package org.arain.power.system.subject.resource;

import java.io.Serializable;

public class SysResourceDto implements Serializable{
	private String id;

    private String enabled;

    private String icon;

    private String name;

    private String pid;

    private String sort;

    private String url;

    private String system;

    private String type;

    private String authorization;

    public String getResourcesJson() {
		return resourcesJson;
	}

	public void setResourcesJson(String resourcesJson) {
		this.resourcesJson = resourcesJson;
	}

	private String havemune;

    private String resourcesJson;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getHavemune() {
		return havemune;
	}

	public void setHavemune(String havemune) {
		this.havemune = havemune;
	}
    
    
}
