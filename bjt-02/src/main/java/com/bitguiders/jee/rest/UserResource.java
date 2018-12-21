package com.bitguiders.jee.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bitguiders.jee.model.UserModel;

@Path("user")
public class UserResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<UserModel> getUser() {
		List<UserModel> usersList = new ArrayList<UserModel>();
		
		usersList.add(new UserModel("Abdul","Kareem","abdulkareem@bitguiders.com"));
		usersList.add(new UserModel("Waqas","Ahmed","waqasahmed@bitguiders.com"));

		return usersList;
	}
}
