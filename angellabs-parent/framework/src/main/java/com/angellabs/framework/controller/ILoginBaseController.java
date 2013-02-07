package com.angellabs.framework.controller;

import org.springframework.web.servlet.ModelAndView;

import com.angellabs.www.entities.User;

public interface ILoginBaseController {

	public ModelAndView loginPage();
	
	public ModelAndView validateUserLogin(User user);
	
	public String logoutUser(User user);
	
	
}
