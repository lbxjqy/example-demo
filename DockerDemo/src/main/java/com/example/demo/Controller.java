package com.example.demo;

import com.example.demo.Exception.MyException;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.entity.*;
//import com.example.demo.repository.ArticleRepository;
//import org.elasticsearch.index.query.QueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class Controller {

    @Resource
    private UserMapper userMapper;
    //    @Resource
//    private ArticleRepository articleRepository;
    @Resource
    RabbitTemplate amqpTemplate;
    @Resource
    RedisTemplate redisTemplate;
//    @Resource
//    private JmsMessagingTemplate jmsMessagingTemplate;

    String context = "hi, i am message 1";
    String context1 = "hi, i am message 2";
    String context2 = "hi, i am message 3";


    @RequestMapping("/json")
    public String json() throws MyException {
        System.out.println("json");
        throw new MyException("拦截MyException 2019.2");
    }

    @RequestMapping("/addUser")
    public JsonData addUser(String name, Integer age) {
        User u = User.build(name, age);
        userMapper.addUser(u);
        return JsonData.buildSuccess(u.getId());
    }

//    @RequestMapping("/addUserRe")
//    public JsonData addUserRe() {
//        stringRedisTemplate.opsForSet().add("liu","1","2","3","4");
//        return  JsonData.buildSuccess();
//    }
//
//    @RequestMapping("/addUserValue")
//    public JsonData addUserValue() {
//        stringRedisTemplate.opsForSet().add("liu","6");
//        return  JsonData.buildSuccess();
//    }
//
//    @PostMapping("/testRedis")
//    public JsonData addUser1(@RequestBody User user) {
//        stringRedisTemplate.opsForValue().set("test","wwerwer");
//        return JsonData.buildSuccess();
//    }
//
//    @PostMapping("/testRedis1")
//    public JsonData testRedis1(@RequestBody User user) {
//        stringRedisTemplate.opsForList();
//        return JsonData.buildSuccess();
//    }

//    @PostMapping("/testRedis2s")
//    public JsonData testRedis1() {
//        System.out.println(articleRepository.findById(1L).toString());
//       return JsonData.buildSuccess();
//    }
//
//    @PostMapping("/testRedis3s")
//    public JsonData testRedis3s() {
//        Article a = new Article();
//        a.setId(2);
//        a.setPv(3333333);
//        a.setTitle("666");
//        articleRepository.save(a);
//        return JsonData.buildSuccess();
//    }
//
//    @GetMapping("search")
//    public Object search (String title) {
//        System.out.println(title);
//        QueryBuilder queryBuilder = QueryBuilders.matchQuery("title",title);
//        Iterable<Article> list =  articleRepository.search(queryBuilder);
//        return JsonData.buildSuccess(list);
//    }

    @GetMapping("rabbitSendU")
    public void rabbitSendU() {
        amqpTemplate.convertAndSend("hello", "{user}");
    }

    @GetMapping("rabbitSend")
    public void send() {
//        amqpTemplate.convertAndSend("exchange", "topic.message", context);
        amqpTemplate.convertAndSend("exchange", "topic.messages", context1);
    }


    @GetMapping("rabbitSend1")
    public void send1() {
//        amqpTemplate.convertAndSend("exchange", "topic.message", context);
        amqpTemplate.convertAndSend("exchange", "topic.messagess", context2);
    }

    @GetMapping("rabbitSendF")
    public void rabbitSendF() {
        amqpTemplate.convertAndSend("fanoutExchange", "", context);
    }

    @GetMapping("rabbitSendR")
    public void rabbitSendR() {
        amqpTemplate.convertAndSend("directExchange", "black", context);
        amqpTemplate.convertAndSend("directExchange", "white", context);
    }

    @GetMapping("redisSet")
    public void redisSet() {
        redisTemplate.opsForValue().set("123", "4ldksksksk");
    }

    @GetMapping("userRedis")
    public User userRedis() {
        User u = (User) redisTemplate.opsForValue().get("user");

        if (u == null) {
            u = userMapper.find(1);
            redisTemplate.opsForValue().set("user", u);
        }

        return u;
    }

    @GetMapping("userSql")
    public User userSql() {
        return userMapper.find(1);
    }

    @GetMapping("userSqlAdd")
    public void userSqlAdd() {
        for(int i = 0;i < 10000;i++) {
            userMapper.addUser(new User("hcb" + i, i));
        }
    }

    @GetMapping("userAgeOrderBy")
    public List<User> userAgeOrderBy() {
        return userMapper.findByAge();
    }
}
