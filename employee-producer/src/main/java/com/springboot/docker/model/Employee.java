package com.springboot.docker.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String empId;
	private String name;
	private String designation;
	private double salary;

}
