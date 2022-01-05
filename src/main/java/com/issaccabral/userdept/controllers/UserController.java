package com.issaccabral.userdept.controllers;

import com.issaccabral.userdept.entities.User;
import com.issaccabral.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User user = repository.findById(id).get();
        return user;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}
