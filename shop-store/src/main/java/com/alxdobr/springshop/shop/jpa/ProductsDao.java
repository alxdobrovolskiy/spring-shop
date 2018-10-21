package com.alxdobr.springshop.shop.jpa;

import com.alxdobr.springshop.shop.jpa.entity.ProductEntity;

import java.util.List;

public interface ProductsDao {

    public void addProduct(ProductEntity productEntity);

    public List<ProductEntity> getAllProducts();
}
