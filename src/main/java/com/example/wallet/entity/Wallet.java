package com.example.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName wallet
 */
@TableName(value ="w_wallet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallet implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    private BigDecimal balance;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}