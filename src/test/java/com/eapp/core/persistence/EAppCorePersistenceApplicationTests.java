package com.eapp.core.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.eapp.core.persistence.model.User;
import com.eapp.core.persistence.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EAppCorePersistenceApplicationTests {

	
	@Autowired
	private UserRepository userRepository;
	
//	@Test
//	public void contextLoads() {
//	}
//	
	
	@Test
	public void testUser() {
		
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
