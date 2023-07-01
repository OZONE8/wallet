package com.example.wallet.mapper;

import com.example.wallet.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-06-30 23:29:19
* @Entity com.example.wallet.entity.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




