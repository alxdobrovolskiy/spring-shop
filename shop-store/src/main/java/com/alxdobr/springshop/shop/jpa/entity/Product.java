package com.alxdobr.springshop.shop.jpa.entity;


import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Product")
@NamedNativeQuery(name="getAllProducts", query = "select * from PRODUCT")
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Currency currency;
    private UnitMeasure unitMeasure;

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PRICE")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENCY_ID")
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNITMEASURE_ID")
    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(UnitMeasure unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(currency, product.currency) &&
                Objects.equals(unitMeasure, product.unitMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, currency, unitMeasure);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", currency=" + currency +
                ", unitMeasure=" + unitMeasure +
                '}';
    }
}
