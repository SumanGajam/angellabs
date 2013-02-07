package com.angellabs.framework.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.angellabs.www.entities.User;

public interface IUserBaseController {

	public ModelAndView joinUser();
	
	public ModelAndView addUser(User user,ModelMap map);
	
	public ModelAndView deleteUser(User user);
	
	
}
