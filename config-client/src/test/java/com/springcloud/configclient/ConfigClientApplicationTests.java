package com.springcloud.configclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class ConfigClientApplicationTests {

    @Autowired
    TestRestTemplate testRestTemplate;
    @Test
    public void contextLoads() {

        System.out.println("-------------kaishi");
        testRestTemplate.postForObject("http://localhost:8881/actuator/bus-refresh",null,Map.class);
        System.out.println("-------------stop");
    }

}
