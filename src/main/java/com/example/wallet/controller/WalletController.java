package com.example.wallet.controller;

import com.example.wallet.dto.Result;
import com.example.wallet.service.WalletService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Resource
    private WalletService walletService;

    //查询余额
    @GetMapping("/balance/{id}")
    public Result queryBalanceById(@PathVariable("id") Long id){
        return walletService.queryBalanceById(id);
    }

    //消费
    @PostMapping("/spend/{id}")
    public Result spend(@PathVariable("id")Long id, String money){
        return walletService.spend(id,money);
    }

    //退款
    @PostMapping("/refund/{id}")
    public Result refund(@PathVariable("id")Long id,String money){
        return walletService.refund(id,money);
    }
}
