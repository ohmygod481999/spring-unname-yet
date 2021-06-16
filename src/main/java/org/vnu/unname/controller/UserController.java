package org.vnu.unname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.vnu.unname.model.Exam;
import org.vnu.unname.model.User;
import org.vnu.unname.service.ExamService;
import org.vnu.unname.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}
