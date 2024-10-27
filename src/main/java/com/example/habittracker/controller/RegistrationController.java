package com.example.habittracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.habittracker.model.User;
import com.example.habittracker.repository.UserRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/register")
	public String showRegistrationForm() {
		return "register";
	}
	
	@GetMapping("/register")
	public String registerUser(@RequestParam String username,@RequestParam String password)
	{
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		userRepository.save(user);
		return "redirect:/login";
	}
}
