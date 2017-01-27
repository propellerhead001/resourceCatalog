/**
 * 
 */
package io.fabric8.quickstarts.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author MillsR
 * This describes the valid for found in each entry
 */
@XmlRootElement(name = "ValidFor")
public class ValidFor {
private Date startDateTime;
private Date endDateTime;



public ValidFor() { }
public ValidFor(Date startDateTime, Date endDateTime) {
	super();
	this.startDateTime = startDateTime;
	this.endDateTime = endDateTime;
}
public Date getStartDateTime() {
	return startDateTime;
}
public void setStartDateTime(Date startDateTime) {
	this.startDateTime = startDateTime;
}
public Date getEndDateTime() {
	return endDateTime;
}
public void setEndDateTime(Date endDateTime) {
	this.endDateTime = endDateTime;
}


}
