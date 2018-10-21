package com.alxdobr.springshop.shop.model;


public class Product {

    private String name;
    private Double price;
    private Currency currency;
    private UnitMeasure unitMeasure;

    public Product() {
    }

    public Product(String name, Double price, Currency currency, UnitMeasure unitMeasure) {
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.unitMeasure = unitMeasure;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(UnitMeasure unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", currency=" + currency +
                ", unitMeasure=" + unitMeasure +
                '}';
    }
}
