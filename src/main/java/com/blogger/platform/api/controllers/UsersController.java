package com.blogger.platform.api.controllers;

import com.blogger.platform.business.abstracts.UserService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/api/users/")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("add")
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }

/*    @PostMapping("addFollower")
    public Result addFollower(@RequestBody User user) {
        *//*Set<Integer> followers = new HashSet<>();
        followers.add(5);
        followers.add(6);
        followers.add(10);
        user.setUser_follower(followers);*//*
        return this.userService.addFollower(user);
    }*/

    @PostMapping("delete")
    public Result delete(@RequestParam int userId) {
        return this.userService.delete(userId);
    }

    @GetMapping("getAll")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("getById")
    public DataResult<User> getById(@RequestParam int userId) {
        return this.userService.getById(userId);
    }

    @GetMapping("getByUserName")
    public DataResult<User> getByUserName(@RequestParam String userName) {
        return this.userService.getByUserName(userName);
    }

    @GetMapping("getByEmail")
    public DataResult<User> getByEmail(@RequestParam String email) {
        return this.userService.getByEmail(email);
    }

}