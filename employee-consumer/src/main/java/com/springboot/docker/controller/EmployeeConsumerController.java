package com.springboot.docker.controller;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumerController {

	@RequestMapping(value = "/consumer", method = RequestMethod.GET)
	public ResponseEntity<String> getEmployee() throws RestClientException, IOException {

		/** Need to pass the Container Name and not the Tag **/
		/** docker run --network producer-consumer --name producer -d -p 8601:8600 employee-producer **/
		String baseUrl = "http://producer:8600/employee";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		return response;
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> homePage()  {
		return new ResponseEntity<>("Application is up and running", HttpStatus.OK);
	}
}
