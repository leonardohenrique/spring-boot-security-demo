package com.example.securitydemo.web;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/me")
	public String me(Principal principal) {
		logger.info("Current logged in username: {}", principal.getName());
		return "users/me";
	}
}
