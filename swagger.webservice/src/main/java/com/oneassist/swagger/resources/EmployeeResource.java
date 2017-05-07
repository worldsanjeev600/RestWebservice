package com.oneassist.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.oneassist.swagger.models.Employee;
import com.oneassist.swagger.services.EmployeeService;

/**
 * This class is just for showing employee details.
 * @author Sanjeev Gupta
 *
 */

@Path("/employees")
@Api(value="/employees", tags="employee: Get all employee details")

public class EmployeeResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="create new employee" ,notes = "Create a new employee account", response=Response.class)
	@ApiResponses({
		@ApiResponse(code = 201, message = "Successfully created"),
		@ApiResponse(code=400, message= "Please enter required fields"),
		@ApiResponse(code=500, message="Internal error server")
	})
	public Response createEmployee(
			@ApiParam(value="employee details", required=true)
			Employee employee){
		EmployeeService employeeService = new EmployeeService() ;
		Employee createdEmployee = employeeService.createEmployee(employee);
		if( createdEmployee.getEmployeeId() == 0){
		return Response.status(Status.BAD_REQUEST).entity(createdEmployee).build();
		}
		return Response.status(Status.CREATED).entity(createdEmployee).build();
	}
}


