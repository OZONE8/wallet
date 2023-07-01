package com.example.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName order
 */
@TableName(value ="w_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    private Integer type;

    private BigDecimal money;

    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Order(Long userId,Integer type,BigDecimal money){
        this.userId=userId;
        this.type=type;
        this.money=money;
    }
}