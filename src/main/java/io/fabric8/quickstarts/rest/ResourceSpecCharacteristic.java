package io.fabric8.quickstarts.rest;

import java.util.ArrayList;

public class ResourceSpecCharacteristic {
	private ValidFor validFor;
	private String name, description, valueType, id;
	private boolean configurable;
	private ArrayList<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue;
	private ArrayList<ResourceSpecCharRelationship> resourceSpecCharRelationship;
	public ResourceSpecCharacteristic(ValidFor validFor, String name, String description, String valueType, String id,
			boolean configurable, ArrayList<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue,
			ArrayList<ResourceSpecCharRelationship> resourceSpecCharRelationship) {
		super();
		this.validFor = validFor;
		this.name = name;
		this.description = description;
		this.valueType = valueType;
		this.id = id;
		this.configurable = configurable;
		this.resourceSpecCharacteristicValue = resourceSpecCharacteristicValue;
		this.resourceSpecCharRelationship = resourceSpecCharRelationship;
	}
	public ResourceSpecCharacteristic() {

	}
	public ValidFor getValidFor() {
		return validFor;
	}
	public void setValidFor(ValidFor validFor) {
		this.validFor = validFor;
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
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isConfigurable() {
		return configurable;
	}
	public void setConfigurable(boolean configurable) {
		this.configurable = configurable;
	}
	public ArrayList<ResourceSpecCharacteristicValue> getResourceSpecCharacteristicValue() {
		return resourceSpecCharacteristicValue;
	}
	public void setResourceSpecCharacteristicValue(
			ArrayList<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue) {
		this.resourceSpecCharacteristicValue = resourceSpecCharacteristicValue;
	}
	public ArrayList<ResourceSpecCharRelationship> getResourceSpecCharRelationship() {
		return resourceSpecCharRelationship;
	}
	public void setResourceSpecCharRelationship(ArrayList<ResourceSpecCharRelationship> resourceSpecCharRelationship) {
		this.resourceSpecCharRelationship = resourceSpecCharRelationship;
	}
	
	
}
