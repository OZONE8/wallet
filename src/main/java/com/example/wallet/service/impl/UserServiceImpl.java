package com.example.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wallet.entity.User;
import com.example.wallet.service.UserService;
import com.example.wallet.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-30 23:24:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




