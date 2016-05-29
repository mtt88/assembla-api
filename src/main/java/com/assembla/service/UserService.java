package com.assembla.service;

import static java.lang.String.format;

import java.util.List;

import com.assembla.User;
import com.assembla.client.AssemblaConstants;
import com.assembla.client.AssemblaRequest;
import com.assembla.client.AssemblaClient;
import com.assembla.utils.ValidationUtils;

public class UserService extends AbstractBaseService {

	public UserService(AssemblaClient assemblaClient, String spaceId) {
		super(assemblaClient, spaceId);
	}

	public User getUser() {
		AssemblaRequest request = new AssemblaRequest(AssemblaConstants.USER_CURRENT, User.class);
		return super.get(request, "Error retreiving current user");
	}

	public User getUser(String idOrLogin) {
		ValidationUtils.notNull(idOrLogin, "idOrLogin == null");
		String uri = format(AssemblaConstants.USER_ID_OR_LOGIN, idOrLogin);
		AssemblaRequest request = new AssemblaRequest(uri, User.class);
		return super.get(request, format("User not found with id/login : %s", idOrLogin));
	}

	public List<User> getUsersForSpace() {
		String uri = format(AssemblaConstants.USERS_FOR_SPACE, super.getSpaceId());
		AssemblaRequest request = new AssemblaRequest(uri, User[].class);
		return super.getList(request);
	}

}
