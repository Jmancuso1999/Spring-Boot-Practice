package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// When working these properties of Spring Boot should automatically have the getters and setters working
@Getter
@Setter
@AllArgsConstructor // Creates a constructor of all the variables we declared (same as the one commented out)
public class User {

	private String name, family;
	private int age;
	/*
	public User(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}*/
	
	public User(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public String getFamily() {return this.family;}
	public void setFamily(String family) {this.family = family;}
	
	public int getAge() {return this.age;}
	public void setAge(int age) {this.age = age;}
	
	
	
	
}
