package com.blogger.platform.api.controllers;

import com.blogger.platform.business.abstracts.UserService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody User user) {
        return this.userService.delete(user);
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/getByUserId")
    public DataResult<User> getByUserId(@RequestParam int userId) {
        return this.userService.getByUserId(userId);
    }

    @GetMapping("/getByUserName")
    public DataResult<User> getByUserName(@RequestParam String userName) {
        return this.userService.getByUserName(userName);
    }

    @GetMapping("/getByEmail")
    public DataResult<User> getByEmail(@RequestParam String email) {
        return this.userService.getByEmail(email);
    }

}