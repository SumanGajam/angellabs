package com.angellabs.framework.services;

import org.springframework.web.servlet.ModelAndView;

import com.angellabs.www.entities.User;

public interface IUserJoinBaseService {
	
	public ModelAndView join(User user);

}
