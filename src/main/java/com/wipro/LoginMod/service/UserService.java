package com.wipro.LoginMod.service;

import com.wipro.LoginMod.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
}
