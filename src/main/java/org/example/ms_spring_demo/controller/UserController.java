package org.example.ms_spring_demo.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.ms_spring_demo.model.User;
import org.example.ms_spring_demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
@RequestMapping("v1/users")
public class UserController {

    UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);

    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
