package com.angellabs.profileservices.dao;

import com.angellabs.framework.dao.ISaveUserBaseDAO;
import com.angellabs.www.entities.User;

public interface ISaveUserDAO extends ISaveUserBaseDAO{

	public void save(User user);
}
