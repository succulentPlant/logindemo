package com.qqgg.redisdemo;

import com.qqgg.redisdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

//相当于启动springboot应用
@SpringBootTest(classes = RedisdemoApplication.class)
public class TestRedisTemplate {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedisTemplate(){
        /*
            RedisTemplate中的 key 和 valu e默认的序列化方式都是 JdkSerializationRedisSerializer
                要使 key：String
                    value：Object
            修改 key 的序列化方案为 StringRedisSerializier
         */

        //修改 key 的序列化方式 String类型的序列
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        User user = new User();
        user.setUserid("01");
        user.setUsername("zhangsan");
        user.setPassword("111222");

        redisTemplate.opsForValue().set("user1" , user);

        User user11 = (User) redisTemplate.opsForValue().get("user1");
        System.out.println(user11);



    }

}
