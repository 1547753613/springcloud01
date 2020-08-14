package com.aaa.springcloudproductb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/",produces = { "application/json;charset=UTF-8" })
public class OrderController {

    @RequestMapping("order")
    public String getOrder(){
        return "查询订单";
    }
}
