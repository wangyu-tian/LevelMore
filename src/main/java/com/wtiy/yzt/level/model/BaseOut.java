package com.wtiy.yzt.level.model;

import lombok.Data;

@Data
public class BaseOut<T> {
    private String code = "000000";
    private String msg = "处理成功";
    private T data;

    public BaseOut() {

    }

    public BaseOut(T t) {
        data = t;
    }

    public BaseOut(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseOut<T> error() {
        code = "999999";
        msg = "系统异常";
        return this;
    }
}
