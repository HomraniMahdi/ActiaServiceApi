package com.example.api.Presentation.Controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import com.example.api.Application.Service.UserService;
import com.example.api.Persistence.Entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService service;


    @GetMapping("/users")

    public List<User> getUsers() {
       return service.getUsers();
    }



}
