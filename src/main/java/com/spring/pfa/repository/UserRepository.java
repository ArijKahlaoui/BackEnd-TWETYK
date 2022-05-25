package com.spring.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pfa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUsername(String username);

}
