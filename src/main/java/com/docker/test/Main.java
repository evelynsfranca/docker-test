package com.docker.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.test.model.User;
import com.docker.test.repository.ModelRepository;

@RestController
@RequestMapping("/api")
public class Main {
    
    @Autowired
    private ModelRepository repository;

    @PostMapping("/users")
    public User post(@RequestBody User user) {
        return repository.save(user);
    } 

    @GetMapping("/users")
    public List<User> get() {
        return repository.findAll();
    } 
}
