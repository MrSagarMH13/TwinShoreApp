package com.i2rtech.twinshoreapp.utils;

import com.google.gson.Gson;

/**
 *
 * @author Sagar
 */
public class JsonConverter {

    public static final String createJsonFromDTO(Object obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

    public final static Object fromJsonToDTO(String json, Class<?> type) {
        Gson gson = new Gson();
        Object obj = gson.fromJson(json, type);
        return obj;
    }
}
