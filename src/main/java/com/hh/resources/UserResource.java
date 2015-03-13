package com.hh.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.hh.mapper.UserMapper;
import com.hh.model.User;

@Path("/users")
public class UserResource {
	@Autowired
    private UserMapper userMapper;
	
	
	@GET
	@Produces("text/plain")
	public String getUser(@PathParam("username") String username)
	{
		return "test";
	}
	
	@GET
	@Path("{userPhoneNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserByID(@PathParam("userPhoneNumber")String userPhoneNumber)
	{
		User user = userMapper.getUser(userPhoneNumber);
		System.out.println("product"+user);
        if(user == null){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }else {
            return user;
        }
	}
}
