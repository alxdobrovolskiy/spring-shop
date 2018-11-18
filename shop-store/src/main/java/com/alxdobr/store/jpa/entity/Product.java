package com.alxdobr.store.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@NamedQuery(name="getAllProducts", query = "SELECT p FROM Product p")
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private Double price;

    @Column(name = "amount")
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
