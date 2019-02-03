package com.peigang.controller;

import com.peigang.service.HystirixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HystirixService hystirixService;

    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String hello(){
        return hystirixService.hystirixService();
    }

}