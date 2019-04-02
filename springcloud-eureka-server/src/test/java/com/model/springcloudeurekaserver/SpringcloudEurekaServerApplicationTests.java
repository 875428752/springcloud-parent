package com.model.springcloudeurekaserver;

import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.management.Agent;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(SpringRunner.class)
//@SpringBootTest
//@Ignore
public class SpringcloudEurekaServerApplicationTests {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("a", null);
        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.put("a", null);
    }

    @Test
    public void contextLoads() {
    }

}
