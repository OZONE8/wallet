package com.example.wallet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wallet.dto.Result;
import com.example.wallet.entity.Order;
import com.example.wallet.entity.User;
import com.example.wallet.service.OrderService;
import com.example.wallet.mapper.OrderMapper;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author ASUS
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-06-30 23:29:19
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

    @Override
    public Result queryByUserId(User user) {
        LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Order::getUserId,user.getId());

        List<Order> list = list(queryWrapper);
        return Result.ok(list);
    }
}




