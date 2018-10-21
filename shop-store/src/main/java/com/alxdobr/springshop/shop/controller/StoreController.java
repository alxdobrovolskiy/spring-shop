package com.alxdobr.springshop.shop.controller;

import com.alxdobr.springshop.shop.jpa.ProductsDao;
import com.alxdobr.springshop.shop.model.Currency;
import com.alxdobr.springshop.shop.model.Product;
import com.alxdobr.springshop.shop.model.UnitMeasure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/store")
public class StoreController {

    @Autowired
    ProductsDao productsRepo;

    @RequestMapping(method = RequestMethod.GET)
    public String initialLoad(Model model){
        System.out.println("invoked initialLoad");

//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("apple", 1.20, new Currency("USD", 840), new UnitMeasure("kilogram")));
//        productList.add(new Product("cherry", 2.99, new Currency("USD", 840), new UnitMeasure("kilogram")));
//        productList.add(new Product("milk", 0.85, new Currency("USD", 840), new UnitMeasure("item")));
//        productList.add(new Product("coffee", 12.99, new Currency("USD", 840), new UnitMeasure("kilogram")));

        model.addAttribute("products", productsRepo.getAllProducts());
        return "store";
    }

}
