package com.qqgg.redisdemo;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//相当于启动springboot应用
@SpringBootTest(classes = RedisdemoApplication.class)
public class TestStringRedisTemplate {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void testString(){
        Set<String> keys = stringRedisTemplate.keys("*");
        stringRedisTemplate.delete(keys);
        stringRedisTemplate.opsForValue().set("name","xt");
        stringRedisTemplate.opsForValue().set("name2","xt2",120, TimeUnit.SECONDS);
        System.out.println("-----------------------------");
    }

    @Test
    public void testKey() {
        boolean haskey = stringRedisTemplate.hasKey("name");
        System.out.println(haskey);

        Set<String> keys = stringRedisTemplate.keys("*");
        keys.forEach(key -> System.out.println("key = " + key));

        Long expire = stringRedisTemplate.getExpire("name2");
        System.out.println(expire);



    }

}
