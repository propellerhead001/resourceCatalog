/**
 * 
 */
package io.fabric8.quickstarts.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author MillsR
 *
 */
@XmlRootElement(name = "Category")
public class Category {
	private String id;
	private String href;
	private Date lastUpdate;
	private String version;
	private String lifecycleStatus;
	private ValidFor validFor;
	private String parentID;
	private boolean isRoot;
	private String name;
	private String description;

	public Category() {	}
	public Category(String id, String href, String version, String lifecycleStatus, ValidFor validFor,
			String parentID, boolean isRoot, String name, String description) {
		super();
		this.id = id;
		this.href = href;
		this.lastUpdate = new Date();
		this.version = version;
		this.lifecycleStatus = lifecycleStatus;
		this.validFor = validFor;
		this.parentID = parentID;
		this.isRoot = isRoot;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		this.lastUpdate = new Date();
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
		this.lastUpdate = new Date();
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
		this.lastUpdate = new Date();
	}
	public String getLifecycleStatus() {
		return lifecycleStatus;
	}
	public void setLifecycleStatus(String lifecycleStatus) {
		this.lifecycleStatus = lifecycleStatus;
		this.lastUpdate = new Date();
	}
	public ValidFor getValidFor() {
		return validFor;
	}
	public void setValidFor(ValidFor validFor) {
		this.validFor = validFor;
		this.lastUpdate = new Date();
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
		this.lastUpdate = new Date();
	}
	public boolean isRoot() {
		return isRoot;
	}
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
		this.lastUpdate = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.lastUpdate = new Date();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
		this.lastUpdate = new Date();
	}

}
