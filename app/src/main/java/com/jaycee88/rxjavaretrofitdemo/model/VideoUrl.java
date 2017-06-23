package com.jaycee88.rxjavaretrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * VideoUrl
 * Created by jaycee on 2017/6/23.
 */
public class VideoUrl {

    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }
}
