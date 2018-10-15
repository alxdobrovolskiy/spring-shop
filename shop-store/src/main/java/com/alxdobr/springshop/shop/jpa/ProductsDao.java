package com.alxdobr.springshop.shop.jpa;

import com.alxdobr.springshop.shop.jpa.entity.Product;

import java.util.List;

public interface ProductsDao {

    public void addProduct(Product product);

    public List<Product> getAllProducts();
}
