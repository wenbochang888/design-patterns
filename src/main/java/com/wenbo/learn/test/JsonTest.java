package com.wenbo.learn.test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenbo.DesignPattern.utils.GsonUtils;
import com.wenbo.learn.model.Person;

/**
 * json 序列化测试
 * @author changwenbo
 * @date 2024/11/23 18:54
 */
public class JsonTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setAge(18);
        person.setName("zhangsan");
        person.setSettle(true);


        // 1. gson
        System.out.println("gson -->  " + GsonUtils.toJson(person));

        // 2. fastjson
        System.out.println("fastjson -->  " + JSON.toJSONString(person));

        // 3. fastjson2
        System.out.println("fastjson2 -->  " + com.alibaba.fastjson2.JSON.toJSONString(person));

        // 4. jackson
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("jackson -->  " + objectMapper.writeValueAsString(person));
    }
}
