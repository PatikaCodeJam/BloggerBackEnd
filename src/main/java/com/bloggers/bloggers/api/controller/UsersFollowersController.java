package com.bloggers.bloggers.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggers.bloggers.business.abstracts.UsersFollowersService;

@RestController
@RequestMapping("api/UsersFollowers/")
public class UsersFollowersController {
	
	private UsersFollowersService usersFollowersService;
	
	@Autowired
	public UsersFollowersController(UsersFollowersService usersFollowersService) {
		this.usersFollowersService = usersFollowersService;
	}

	@GetMapping("getall")
	public void getAll() {
		usersFollowersService.getAll();
	}
}
