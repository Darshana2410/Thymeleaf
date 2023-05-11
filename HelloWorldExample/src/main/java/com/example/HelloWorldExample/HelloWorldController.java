package com.example.HelloWorldExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public void helloWorld() {
		System.out.println("Hello World from web...!!!!");
	}
}