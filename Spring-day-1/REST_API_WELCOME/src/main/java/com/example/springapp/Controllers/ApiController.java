package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {

	@GetMapping(path = "/welcome")
	public String Welcome() {
		return "Welcome Spring Boot!";
	}

	@GetMapping(path = "/")
	public String getName(String studentName) {
		return "Welcome " + studentName + "!";
	}

	@GetMapping(path = "/")
	public String getMyFav(String yourFavColor) {
		return "My favorite color is " + yourFavColor;
	}

}
