/**
 * 
 */
package io.fabric8.quickstarts.rest;

import javax.annotation.Resource;
import javax.ws.rs.core.Context;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MillsR
 *
 */
@Path("/catalogManagement/")
@Api(value = "/catalogueManagement", description = "Operations about catalogueManagement")
public class CatalogManagement {
	private static final Logger LOG = LoggerFactory.getLogger(CatalogManagement.class);

	Map<String, Category> categories = new HashMap<String, Category>();


	private MessageContext jaxrsContext;

	public CatalogManagement() {
		init();
	}

	private void init() {
		Category c = new Category("42", null, "2.0", "Active", new ValidFor(new Date(), null), "41", false, "Cloud Resources", "A category to hold all cloud resources");

		categories.put(c.getId(), c);

	}

	/**
	 * This method is mapped to an HTTP GET of 'http://localhost:8181/cxf/crm/customerservice/customers/{id}'.  The value for
	 * {id} will be passed to this message as a parameter, using the @PathParam annotation.
	 * <p/>
	 * The method returns a Customer object - for creating the HTTP response, this object is marshaled into JSON using JAXB.
	 * <p/>
	 * For example: surfing to 'http://localhost:8181/cxf/crm/customerservice/customers/123' will show you the information of
	 * customer 123 in JSON format.
	 */

	@GET
	@Path("/category/{id}/")
	@Produces("application/json")
	@ApiOperation(value = "Find Category by ID", notes = "More notes about this method", response = Category.class)
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "Invalid ID supplied"),
			@ApiResponse(code = 204, message = "Category not found")
	})
	public Category getCategory(@ApiParam(value = "ID of Category to fetch", required = true) @PathParam("id") String id) {
		LOG.info("Invoking getCategory, Customer id is: {}", id);
		Category c = categories.get(id);
		return c;
	}

	@GET
	@Path("/category")
	@Produces("application/json")
	@ApiOperation(value = "Return list of Categories", notes = "More notes about this method", response = Map.class)
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Category list empty")
	})
	public Map<String, Category> getCategory() {
		return categories;
	}

	/**
	 * Using HTTP PUT, we can can upload the JSON representation of a customer object.  This operation will be mapped
	 * to the method below and the JSON representation will get unmarshaled into a real Customer object using JAXB.
	 * <p/>
	 * The method itself just updates the customer object in our local data map and afterwards uses the Reponse class to
	 * build the appropriate HTTP response: either OK if the update succeeded (translates to HTTP Status 200/OK) or not
	 * modified if the method failed to update a customer object (translates to HTTP Status 304/Not Modified).
	 * <p/>
	 * Note how this method is using the same @Path value as our next method - the HTTP method used will determine which
	 * method is being invoked.
	 */
	@PUT
	@Path("/category/")
	@Consumes("application/json")
	@ApiOperation(value = "Update an existing Category")
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "Invalid ID supplied"),
			@ApiResponse(code = 204, message = "Category not found")
	})
	public Response updateCustomer(@ApiParam(value = "Category object that needs to be updated", required = true) Category category) {
		LOG.info("Invoking updateCustomer, Customer name is: {}", category.getName());
		Category c = categories.get(category.getId());
		Response r;
		if (c != null) {
			categories.put(category.getId(), category);
			r = Response.ok().build();
		} else {
			r = Response.notModified().build();
		}

		return r;
	}

	/**
	 * Using HTTP POST, we can add a new customer to the system by uploading the JSON representation for the customer.
	 * This operation will be mapped to the method below and the JSON representation will get unmarshaled into a real
	 * Customer object.
	 * <p/>
	 * After the method has added the customer to the local data map, it will use the Response class to build the HTTP reponse,
	 * sending back the inserted customer object together with a HTTP Status 200/OK.  This allows us to send back the
	 * new id for the customer object to the client application along with any other data that might have been updated in
	 * the process.
	 * <p/>
	 * Note how this method is using the same @Path value as our previous method - the HTTP method used will determine which
	 * method is being invoked.
	 */
	@POST
	@Path("/category/")
	@Consumes("application/json")
	@ApiOperation(value = "Add a new Category")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Invalid ID supplied"), })
	public Response addCustomer(@ApiParam(value = "Category object that needs to be updated", required = true) Category category) {
		LOG.info("Invoking addCustomer, Category name is: {}", category.getName());

		categories.put(category.getId(), category);

		return Response.ok().type("application/json").entity(category).build();

	}
}
