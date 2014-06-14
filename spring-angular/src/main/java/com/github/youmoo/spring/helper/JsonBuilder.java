package com.github.youmoo.spring.helper;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * 一个简单的json构造器
 * @autor youmoo
 * @since 2014-06-14 下午5:46
 */
public class JsonBuilder {
    Map<String, Object> json = ObjectFactory.newHashMap();

    public JsonBuilder put(String key, Object value) {
        json.put(key, value);
        return this;
    }

    public String build() {
        return JSONObject.toJSONString(json);
    }
}
