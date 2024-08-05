package org.example.ms_spring_demo.controller;

import lombok.RequiredArgsConstructor;
import org.example.ms_spring_demo.service.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

// @Qulifier versiyasi
//    public OrderController(@Qualifier("orderServiceImpl") OrderService orderService) {
//        this.orderService = orderService;
//    }

    @GetMapping
    public String getOrder() {
        return orderService.getOrder();
    }
}




