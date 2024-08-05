package org.example.ms_spring_demo.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.ms_spring_demo.model.User;
import org.example.ms_spring_demo.model.request.CreateUserRequest;
import org.example.ms_spring_demo.model.response.CreateUserResponse;
import org.example.ms_spring_demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.HTTP_VERSION_NOT_SUPPORTED;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
@RequestMapping("v1/users")
public class UserController {

    UserService userService;

    @PostMapping
    @ResponseStatus(CREATED)
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @PatchMapping("/{id}")
    public void updateUserAge(@PathVariable String id, @RequestParam Integer age) {
        userService.updateUserAge(id, age);
    }
}
