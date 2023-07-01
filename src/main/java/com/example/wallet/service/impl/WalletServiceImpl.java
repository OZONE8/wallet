package com.example.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wallet.dto.Result;
import com.example.wallet.entity.Order;
import com.example.wallet.entity.Wallet;
import com.example.wallet.mapper.OrderMapper;
import com.example.wallet.service.WalletService;
import com.example.wallet.mapper.WalletMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
* @author ASUS
* @description 针对表【wallet】的数据库操作Service实现
* @createDate 2023-06-30 23:29:12
*/
@Service
public class WalletServiceImpl extends ServiceImpl<WalletMapper, Wallet>
    implements WalletService{

    @Resource
    private OrderMapper orderMapper;

    //查询余额
    @Override
    public Result queryBalanceById(Long id) {
        Wallet wallet = getById(id);
        return Result.ok(wallet);
    }

    //消费
    @Override
    @Transactional
    public Result spend(Long id, String money) {
        Wallet wallet = getById(id);
        BigDecimal spend=new BigDecimal(money);
        if (spend.compareTo(new BigDecimal(0))<0){
            return Result.ok("金额不能为负数",null);
        }

        BigDecimal balance = wallet.getBalance();
        if (balance.compareTo(spend)<0){
            return Result.ok("余额不足",null);
        }
        wallet.setBalance(balance.subtract(spend));

        updateById(wallet);

        orderMapper.insert(new Order(id,1,spend));

        return Result.ok("消费成功",null);
    }

    //退款
    @Override
    @Transactional
    public Result refund(Long id, String money) {
        Wallet wallet = getById(id);
        BigDecimal refund = new BigDecimal(money);
        if (refund.compareTo(new BigDecimal(0))<0){
            return Result.ok("金额不能为负数",null);
        }

        BigDecimal balance = wallet.getBalance();
        wallet.setBalance(balance.add(refund));
        updateById(wallet);

        orderMapper.insert(new Order(id,2,refund));
        return Result.ok("退款成功",null);
    }
}




