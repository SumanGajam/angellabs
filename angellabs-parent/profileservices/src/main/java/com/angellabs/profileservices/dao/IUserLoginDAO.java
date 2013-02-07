package com.angellabs.profileservices.dao;

import com.angellabs.framework.dao.ILoginUserBaseDAO;
import com.angellabs.www.entities.User;

public interface IUserLoginDAO extends ILoginUserBaseDAO {

	public User validateUserLogin(User user);
}
