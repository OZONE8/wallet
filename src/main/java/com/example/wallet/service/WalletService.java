package com.example.wallet.service;

import com.example.wallet.dto.Result;
import com.example.wallet.entity.Wallet;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ASUS
* @description 针对表【wallet】的数据库操作Service
* @createDate 2023-06-30 23:29:12
*/
public interface WalletService extends IService<Wallet> {

    Result queryBalanceById(Long id);

    Result spend(Long id, String money);

    Result refund(Long id, String money);
}
