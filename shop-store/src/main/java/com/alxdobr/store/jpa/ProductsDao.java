package com.alxdobr.store.jpa;

import com.alxdobr.store.jpa.entity.Product;

import java.util.List;

public interface ProductsDao {

    public void addProduct(Product productEntity);

    public List<Product> getAllProducts();
}
