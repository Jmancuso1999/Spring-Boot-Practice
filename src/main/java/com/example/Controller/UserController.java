package com.example.Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.User;
import com.example.Service.userService;

@RestController
public class UserController {

	@Autowired
	userService userService;
	
	@GetMapping(value="/users") 
	public List<User> getUserController(@RequestParam( value="age" ) int age,
										@RequestParam (value="name" ) String name) {
		
		
		User u1 = new User(name, "Doe", age);
		User u2 = new User("Jane", "Doe", age);
		
		List <User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		
		return users;
	}
	
	@PutMapping(value = "/users")
	public Map<String, String> putUserController() {
		HashMap<String, String> createUserReturn = new HashMap<>();
		createUserReturn.put("message", "Users has been updated");
		
		return createUserReturn;
		
	}

	// Note: There is some bugs here since this application was incomplete
	
	@PostMapping( value = "/users/{id}" )
	public ResponseEntity< Map > createNewUserController(
			@RequestParam String name,
			@RequestParam String family,
			@RequestParam int age) {
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(name, family, age));
	}
	
	@DeleteMapping( value = "/users" )
	public Map<String, String> deleteUserController() {
			
			HashMap <String, String> deleteUserReturn = new HashMap<>();
			
			deleteUserReturn.put("message", "User has been created");
			
			return deleteUserReturn;
			
	}
	
	
}
