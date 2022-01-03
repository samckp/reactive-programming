package com.reactive.r2dbc.controller;

import com.reactive.r2dbc.model.User;
import com.reactive.r2dbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<User> create(@RequestBody User user){
        return userService.createUser(user);
    }

}
