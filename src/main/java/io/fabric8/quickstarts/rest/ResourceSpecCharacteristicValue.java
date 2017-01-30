package io.fabric8.quickstarts.rest;

public class ResourceSpecCharacteristicValue {
	private String valueType, defaultValue, value, unitOfMeasure;
	private ValidFor validFor;
	public ResourceSpecCharacteristicValue() {
		super();
	}
	public ResourceSpecCharacteristicValue(String valueType, String defaultValue, String value, String unitOfMeasure,
			ValidFor validFor) {
		super();
		this.valueType = valueType;
		this.defaultValue = defaultValue;
		this.value = value;
		this.unitOfMeasure = unitOfMeasure;
		this.validFor = validFor;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public ValidFor getValidFor() {
		return validFor;
	}
	public void setValidFor(ValidFor validFor) {
		this.validFor = validFor;
	}
	
	
	
}
