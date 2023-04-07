package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {
	
	private int id; 
	private String name; 
	private int age; 
	private String email;
	
}
