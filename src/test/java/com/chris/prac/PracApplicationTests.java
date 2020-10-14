package com.chris.prac;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class PracApplicationTests {

    @Test
    void contextLoads() {
        //请求地址
        String url = "http://localhost:8080/sign-in";
        //入参
        Map<String, Object> request = new HashMap<>();

        RestTemplate restTemplate = new RestTemplate();
        Object responseBean = restTemplate.postForObject(url, request, Map.class);
    }

}
