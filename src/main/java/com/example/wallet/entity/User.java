package com.example.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName user
 */
@TableName(value ="w_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}