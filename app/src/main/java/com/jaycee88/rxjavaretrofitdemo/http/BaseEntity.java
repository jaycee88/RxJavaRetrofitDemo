package com.jaycee88.rxjavaretrofitdemo.http;

import com.google.gson.annotations.SerializedName;

/**
 * 服务器通用返回数据格式
 * Created by jaycee on 2017/6/23.
 */
public class BaseEntity<E> {

    @SerializedName("code")
    private int code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private E data;

    public boolean isSuccess() {
        return code == 0;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public E getData() {
        return data;
    }
}
