package com.example.retrofitEjemplo.controller;

import com.example.retrofitEjemplo.model.User;
import com.example.retrofitEjemplo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> fetchPosts() {
        return userService.fetchUser();
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getPost(@PathVariable("id") int id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

}
