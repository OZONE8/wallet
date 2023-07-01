package com.example.wallet.mapper;

import com.example.wallet.entity.Wallet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【wallet】的数据库操作Mapper
* @createDate 2023-06-30 23:29:12
* @Entity com.example.wallet.entity.Wallet
*/
@Mapper
public interface WalletMapper extends BaseMapper<Wallet> {

}




