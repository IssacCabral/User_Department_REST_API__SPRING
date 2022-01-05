package com.issaccabral.userdept.controllers;

import com.issaccabral.userdept.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    public List<User> findAll(){
        
    }
}
