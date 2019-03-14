package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    private Task task;

    @Test
    public void test() throws Exception {
        for (int i = 0; i < 1000; i++) {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();

            if (i == 999) {
                System.exit(0);
            }
        }
    }

}

