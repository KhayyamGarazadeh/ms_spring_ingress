package org.example.ms_spring_demo.service;

import org.example.ms_spring_demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(Long id) {
        return User.builder()
                .id(id)
                .name("Orxan HEsenov")
                .age(28)
                .build();


    }

    public void saveUser(User user) {

    }


}
