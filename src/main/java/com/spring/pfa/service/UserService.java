package com.spring.pfa.service;

import java.util.Set;

import com.spring.pfa.entity.User;
import com.spring.pfa.entity.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	public void deleteUser(Long userId);
}
