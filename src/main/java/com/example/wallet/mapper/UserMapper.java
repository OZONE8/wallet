package com.example.wallet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wallet.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-06-30 23:24:26
* @Entity com.example.wallet.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




