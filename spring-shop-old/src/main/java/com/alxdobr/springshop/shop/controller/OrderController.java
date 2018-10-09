package com.alxdobr.springshop.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping(value = "/hello")
    public String start(Model model){
        System.out.println("start invoked");
        return "shop";
    }

}
