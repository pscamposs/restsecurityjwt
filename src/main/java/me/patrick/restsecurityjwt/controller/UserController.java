package me.patrick.restsecurityjwt.controller;

import lombok.RequiredArgsConstructor;
import me.patrick.restsecurityjwt.model.UserModel;
import me.patrick.restsecurityjwt.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService service;

    @PostMapping
    public void postUser(@RequestBody UserModel user){
        service.createUser(user);
    }
}