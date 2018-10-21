package com.alxdobr.springshop.shop.controller;

import com.alxdobr.springshop.shop.jpa.ProductsDao;
import com.alxdobr.springshop.shop.model.Product;
import com.alxdobr.springshop.shop.service.StoreService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/store")
public class StoreController {


    private static Logger log = LogManager.getLogger(StoreController.class.getName());


    @Autowired
    StoreService storeService;

    @ModelAttribute("product")
    public Product getProduct() {

        return new Product();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initialLoad(Model model){
        System.out.println("invoked initialLoad");

        model.addAttribute("products", storeService.getAllProducts());
        return "store";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView processSubmit(@Valid Product product, Errors errors){
        if (errors.hasErrors()){
            log.warn("Add product valodation failed");
            return new ModelAndView("store");
        } else {
            storeService.addProduct(product);

            ModelAndView mav = new ModelAndView("store");
            mav.addObject("products", storeService.getAllProducts());

            return mav;
        }

    }

}
