package com.angellabs.profileservices;

import org.springframework.web.servlet.ModelAndView;

import com.angellabs.framework.services.IUserJoinBaseService;
import com.angellabs.www.entities.User;

public interface IUserJoinProfileService extends IUserJoinBaseService {

	public ModelAndView join( User user);
	
}
