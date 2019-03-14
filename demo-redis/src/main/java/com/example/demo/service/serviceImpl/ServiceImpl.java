package com.example.demo.service.serviceImpl;

import com.example.demo.service.Service;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @description: serviceImpl
 * @author: lin
 * @create: 2019/02/14 14:17
 */
@org.springframework.stereotype.Service
@CacheConfig
public class ServiceImpl implements Service, ApplicationRunner {

    @Resource
    RedisTemplate redisTemplate;

    @Override
    public void test() {
        for(int i = 0;i < 100;i++) {
            redisTemplate.opsForZSet().add("user_score_zset2",String.valueOf(i),Math.random()*100);
        }
    }

    public Set<String> range() {
        return redisTemplate.opsForZSet().range("user_score_zset2",1,10);
    }

    @Override
    public Long zCard() {
        return redisTemplate.opsForZSet().zCard("user_score_zset2");
    }

//

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
