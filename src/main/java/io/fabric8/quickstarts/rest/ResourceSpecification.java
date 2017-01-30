package io.fabric8.quickstarts.rest;

import java.util.ArrayList;
import java.util.Date;

public class ResourceSpecification {
	private String id, name, description, brand, version, lifecycleStatus, href;
	private ValidFor validFor;
	private Date lastUpdate;
	private ArrayList<ResourceSpecCharacteristic> resourceSpecCharacteristic;
	
	
	public ResourceSpecification() {
		this.lastUpdate = new Date();
	}
	
	
	
	public ResourceSpecification(String id, String name, String description, String brand, String version,
			String lifecycleStatus, String href, ValidFor validFor,
			ArrayList<ResourceSpecCharacteristic> resourceSpecCharacteristic) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.version = version;
		this.lifecycleStatus = lifecycleStatus;
		this.href = href;
		this.validFor = validFor;
		this.resourceSpecCharacteristic = resourceSpecCharacteristic;
		this.lastUpdate = new Date();
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLifecycleStatus() {
		return lifecycleStatus;
	}
	public void setLifecycleStatus(String lifecycleStatus) {
		this.lifecycleStatus = lifecycleStatus;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public ValidFor getValidFor() {
		return validFor;
	}
	public void setValidFor(ValidFor validFor) {
		this.validFor = validFor;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}



	public ArrayList<ResourceSpecCharacteristic> getResourceSpecCharacteristic() {
		return resourceSpecCharacteristic;
	}


	public void setResourceSpecCharacteristic(ArrayList<ResourceSpecCharacteristic> resourceSpecCharacteristic) {
		this.resourceSpecCharacteristic = resourceSpecCharacteristic;
	}

}
