/**
 * 
 */
package io.fabric8.quickstarts.rest;

/**
 * @author millsr
 *
 */
public class ResourceSpecCharRelationship {
	private ValidFor validFor;
	private String type, id;
	public ResourceSpecCharRelationship(ValidFor validFor, String type, String id) {
		super();
		this.validFor = validFor;
		this.type = type;
		this.id = id;
	}
	public ResourceSpecCharRelationship() {
		super();
	}
	public ValidFor getValidFor() {
		return validFor;
	}
	public void setValidFor(ValidFor validFor) {
		this.validFor = validFor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
