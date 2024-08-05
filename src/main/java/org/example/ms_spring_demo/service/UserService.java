package org.example.ms_spring_demo.service;

import org.example.ms_spring_demo.model.User;
import org.example.ms_spring_demo.model.request.CreateUserRequest;
import org.example.ms_spring_demo.model.response.CreateUserResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    public CreateUserResponse createUser(CreateUserRequest request) {
        var id = UUID.randomUUID().toString();
        users.put(id, new User(id, request.getName(), request.getAge()));
        return new CreateUserResponse(id);
    }

    public void updateUserAge(String id, Integer age) {
        var user = users.get(id);
        if (user == null) {
            throw new RuntimeException("User not found ");
        }
        user.setAge(age);
        users.put(id, user);
    }


}
