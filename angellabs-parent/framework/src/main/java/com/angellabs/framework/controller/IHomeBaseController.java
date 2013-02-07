package com.angellabs.framework.controller;

import org.springframework.web.servlet.ModelAndView;

public interface IHomeBaseController {
	
	public String homePage();
	
    public String aboutUs();
	
	public String help();
	
	public ModelAndView getReviews();
	
	public String getBlog();
	
	public ModelAndView signUpWithTwitter();
	
	public String getApi();
	
	public String getTermsandConditions();
	
	
}
