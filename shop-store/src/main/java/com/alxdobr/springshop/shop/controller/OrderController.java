package com.alxdobr.springshop.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/store")
public class OrderController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        System.out.println("start invoked");
        model
        return "store";
    }

}
