package com.example.wallet.service;

import com.example.wallet.dto.Result;
import com.example.wallet.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wallet.entity.User;

/**
* @author ASUS
* @description 针对表【order】的数据库操作Service
* @createDate 2023-06-30 23:29:19
*/
public interface OrderService extends IService<Order> {


    Result queryByUserId(User user);
}
