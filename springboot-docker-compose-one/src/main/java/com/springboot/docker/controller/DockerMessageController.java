package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
	
	@GetMapping("/message/{name}")
	public String getDocker(@PathVariable("name") String name)
	{
		return "Dockerizing Spring Boot Application";
	}

}
