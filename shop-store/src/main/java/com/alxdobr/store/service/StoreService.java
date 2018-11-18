package com.alxdobr.store.service;

import com.alxdobr.store.jpa.ProductsDao;
import com.alxdobr.store.jpa.entity.Product;
import com.alxdobr.store.model.ProductDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    private static Logger log = LogManager.getLogger(StoreService.class.getName());

    @Autowired
    ProductsDao productsRepo;

    public List<ProductDTO> getAllProducts(){
        List<ProductDTO> result = new ArrayList<>();
        for (Product productEntity : productsRepo.getAllProducts()){
            result.add(new ProductDTO(productEntity));
        }
        return result;
    }

    public void addProduct(ProductDTO productDTO){
        log.info(productDTO);
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setAmount(productDTO.getAmount());
        productsRepo.addProduct(product);
    }

}
