package com.exterro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = {"http://localhost:9090"})
@RestController
public class ServerController {
	//@CrossOrigin(origins = {"http://localhost:9090"})
	@Autowired
	private Apple apple;
	@Autowired
	private Orange orange;
	@Autowired
	private Demo demo;
	
	@GetMapping("/access")
	public String greeting() {
		apple.display();
		orange.display();
		demo.diaplay();
		
		return "Welcome to Exterro World";
	}
}
