package com.starlab.msa.personalinfo.controller;


import com.starlab.msa.personalinfo.domain.User;
import com.starlab.msa.personalinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/gender/{info}")
    public List<User> getGenderUsers(@PathVariable("info") String info) {
        return userService.getGenderUsers(info);
    }

    @GetMapping("/weight-between/{start}/{end}")
    public List<User> getWeightBetween(
            @PathVariable("start") double start,
            @PathVariable("end") double end) {
        return userService.getWeightBetween(start, end);
    }

    @GetMapping("/age-between/{start}/{end}")
    public List<User> getAgeBetween(
            @PathVariable int start,
            @PathVariable int end ) {
        return userService.getAgeBetween(start, end);
    }

}
