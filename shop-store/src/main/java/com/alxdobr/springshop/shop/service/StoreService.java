package com.alxdobr.springshop.shop.service;

import com.alxdobr.springshop.shop.controller.StoreController;
import com.alxdobr.springshop.shop.jpa.ProductsDao;
import com.alxdobr.springshop.shop.jpa.entity.CurrencyEntity;
import com.alxdobr.springshop.shop.jpa.entity.ProductEntity;
import com.alxdobr.springshop.shop.jpa.entity.UnitMeasureEntity;
import com.alxdobr.springshop.shop.model.Currency;
import com.alxdobr.springshop.shop.model.Product;
import com.alxdobr.springshop.shop.model.UnitMeasure;
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

    public List<Product> getAllProducts(){
        List<Product> result = new ArrayList<>();
        for (ProductEntity productEntity : productsRepo.getAllProducts()){
            Product product = new Product();
            product.setName(productEntity.getName());
            product.setPrice(productEntity.getPrice());
            Currency currency = new Currency();
            currency.setName(productEntity.getCurrencyEntity().getName());
            currency.setCode(productEntity.getCurrencyEntity().getCode());
            product.setCurrency(currency);
            UnitMeasure unitMeasure = new UnitMeasure();
            unitMeasure.setName(productEntity.getUnitMeasureEntity().getName());
            product.setUnitMeasure(unitMeasure);
            result.add(product);
        }
        return result;
    }

    public void addProduct(Product product){
        log.info(product);
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(product.getName());
        productEntity.setPrice(product.getPrice());
        CurrencyEntity currencyEntity = new CurrencyEntity();
        currencyEntity.setName(product.getCurrency().getName());
        currencyEntity.setCode(product.getCurrency().getCode());
        productEntity.setCurrencyEntity(currencyEntity);
        UnitMeasureEntity unitMeasureEntity = new UnitMeasureEntity();
        unitMeasureEntity.setName(product.getUnitMeasure().getName());
        productEntity.setUnitMeasureEntity(unitMeasureEntity);
        productsRepo.addProduct(productEntity);
    }

}
