package com.example.USER.ENTITY;

import com.example.USER.ENTITY.Notification;
import com.example.USER.ENTITY.Post;
import com.example.USER.ENTITY.User;
import com.example.USER.ENTITY.UserWithDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{userid}")
    public UserWithDetails getUser(@PathVariable int userid) {
        User user = new User(userid, "controller of " + userid, 30);

        Post post = restTemplate.getForObject("http://localhost:8081/posts/" + userid, Post.class);
        Notification notification = restTemplate.getForObject("http://localhost:8082/notifications/" + userid, Notification.class);

        return new UserWithDetails(user, post, notification);
    }
}