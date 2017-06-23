package com.jaycee88.rxjavaretrofitdemo.http;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.jaycee88.rxjavaretrofitdemo.model.User;

import java.lang.reflect.Type;

/**
 * UserTypeAdapter
 * Created by jaycee on 2017/6/23.
 */
public class UserTypeAdapter implements JsonDeserializer<User> {
    @Override
    public User deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (json.isJsonObject()) {
            Gson gson = new Gson();
            return gson.fromJson(json, User.class);
        }
        return null;
    }
}
