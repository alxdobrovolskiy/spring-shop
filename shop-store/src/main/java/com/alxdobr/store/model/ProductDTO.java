package com.alxdobr.store.model;


import com.alxdobr.store.jpa.entity.Product;

public class ProductDTO {

    private String name;
    private Double price;
    private Integer amount;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = product.getAmount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
