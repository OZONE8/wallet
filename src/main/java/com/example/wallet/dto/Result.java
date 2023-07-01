package com.example.wallet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String msg;
    private Object data;

    public static Result ok(Object data) {
        return new Result(null,data);
    }

    public static Result ok(String msg, Object data) {
        return new Result(msg,data);
    }
}
