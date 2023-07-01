package com.example.wallet.controller;

import com.example.wallet.dto.Result;
import com.example.wallet.entity.User;
import com.example.wallet.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    //查询账单明细
    @GetMapping
    public Result queryByUserId(User user){
        return orderService.queryByUserId(user);
    }
}
