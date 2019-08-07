package com.eapp.core.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eapp.core.persistence.model.User;
import com.eapp.core.persistence.repository.UserRepository;

@SpringBootApplication
public class EAppCorePersistenceApplication implements CommandLineRunner {

	 
	
	public static void main(String[] args) {
		SpringApplication.run(EAppCorePersistenceApplication.class, args);
	}
	
	
	@Autowired
	private UserRepository userRepository;

	 

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setFirstName("test");
		user.setLastName("test last");
		user.setEmail("a@a.a");
		user.setPassword("asdf");
		user.setActive(true);
		user.setDeleted(false);
		
		
		userRepository.save(user);
		
			
		
		
	}
	

}
