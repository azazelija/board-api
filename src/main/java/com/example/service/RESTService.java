package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/chats")
public class RESTService {
    @Autowired
    private UserDao userDao;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        RestTemplate restTemplate = new RestTemplate();
        userDao.save(Objects.requireNonNull(restTemplate.getForObject("/", User.class)));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
