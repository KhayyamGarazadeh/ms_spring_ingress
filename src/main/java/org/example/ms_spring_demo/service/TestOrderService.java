package org.example.ms_spring_demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class TestOrderService implements  OrderService{

    @Override
    public String getOrder() {
        return "Hello from test environment";
    }
}
