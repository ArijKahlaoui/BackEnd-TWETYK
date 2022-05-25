package com.spring.pfa.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.spring.pfa.entity.User;
import com.spring.pfa.entity.UserRole;
import com.spring.pfa.helper.UserFoundException;
import com.spring.pfa.repository.RoleRepository;
import com.spring.pfa.repository.UserRepository;
import com.spring.pfa.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository ;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local !=null) {
			System.out.println("user already there");
			throw new UserFoundException();
		}else {
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public User getUser(String username) {
		
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		 this.userRepository.deleteById(userId);
	}

}
