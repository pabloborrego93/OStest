package com.pbg.OStest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbg.OStest.dto.Mensaje;

@RestController(value = "/helloWorld")
public class MainController {
	
	@GetMapping
	public Mensaje helloWorld() {
		return new Mensaje(new String("Hello world!"));
	}

}
