package com.angellabs.framework.dao;

import com.angellabs.www.entities.User;

public interface ILoginUserBaseDAO {

	public User validateUserLogin(User user);
	
}
