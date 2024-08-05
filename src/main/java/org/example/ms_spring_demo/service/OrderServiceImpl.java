package org.example.ms_spring_demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@primary ile versiyasi
@Primary
public class OrderServiceImpl implements OrderService {


    @Override
    public String getOrder() {
        return "Hello from production";
    }
}
