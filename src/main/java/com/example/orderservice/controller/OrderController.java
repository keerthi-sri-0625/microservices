
package com.example.orderservice.controller;

import com.example.orderservice.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping
    public String getOrder() {
        String userInfo = userServiceClient.getUserInfo();
        return "Order Service: " + userInfo;
    }
}


