package com.example.Service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class userService {
	
	public void createUser(String name, String family, int age) {
		
		HashMap<String, String> createUserReturn = new HashMap<>();
		createUserReturn.put("message", "User has been created");
		createUserReturn.put("name", name);
		createUserReturn.put("family", family);
		
		if(age > 20) createUserReturn.put("age", "Hello");
		else createUserReturn.put("age", "Goodbye");
		
			
	}
	
}
