package com.spring.pfa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.spring.pfa.entity.Role;
import com.spring.pfa.entity.User;
import com.spring.pfa.entity.UserRole;
import com.spring.pfa.helper.UserFoundException;
import com.spring.pfa.service.UserService;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
			System.out.println("starting code");
			/*
			 * try { User user = new User();
			 * 
			 * 
			 * user.setFirstName("Admin"); user.setLastName("TwaTyk");
			 * user.setUsername("Admin");
			 * user.setPassword(this.bcryptPasswordEncoder.encode("admin"));
			 * user.setEmail("admin@gmail.com"); user.setProfile("admin.png");
			 * 
			 * Role role1 = new Role(); role1.setRoleId(101L); role1.setRoleName("ADMIN");
			 * 
			 * Set<UserRole> userRoleSet = new HashSet<>(); UserRole userRole = new
			 * UserRole();
			 * 
			 * userRoleSet.add(userRole); userRole.setRole(role1); userRole.setUser(user);
			 * userRoleSet.add(userRole);
			 * 
			 * User user1=this.userService.createUser(user, userRoleSet);
			 * System.out.println(user1.getUsername());
			 * 
			 * }catch (UserFoundException e) { e.printStackTrace(); }
			 */
		
	}

}
