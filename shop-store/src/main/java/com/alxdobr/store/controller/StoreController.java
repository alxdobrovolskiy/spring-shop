package com.alxdobr.store.controller;

import com.alxdobr.store.model.ProductDTO;
import com.alxdobr.store.service.StoreService;
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

//import javax.validation.Valid;

@Controller
@RequestMapping(value = "/store")
public class StoreController {


    private static Logger log = LogManager.getLogger(StoreController.class.getName());

    @Autowired
    StoreService storeService;

    @ModelAttribute("product")
    public ProductDTO getProduct() {

        return new ProductDTO();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initialLoad(Model model){
        System.out.println("invoked initialLoad");

        model.addAttribute("product", new ProductDTO());
        model.addAttribute("products", storeService.getAllProducts());
        return "store";
    }

    @RequestMapping(value = "/processSubmit", method = RequestMethod.POST)
   // @Valid
    public ModelAndView processSubmit(@ModelAttribute ProductDTO productDTO, Errors errors){
        if (errors.hasErrors()){
            log.warn("Add productDTO validation failed");
            return new ModelAndView("store");
        } else {
            log.info(productDTO);
            log.info("store service == null => " + (storeService == null));

            storeService.addProduct(productDTO);

            ModelAndView mav = new ModelAndView("store");
            mav.addObject("product", new ProductDTO());
            mav.addObject("products", storeService.getAllProducts());

            return mav;
        }

    }

}
