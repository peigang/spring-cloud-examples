package com.peigang.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystirixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrirxBack")
    public String hystirixService(){
        return restTemplate.getForEntity("http://spring-cloud-producer/hello",String.class).getBody();
    }

    public String hystrirxBack(){
        return "坏事了";
    }
}
