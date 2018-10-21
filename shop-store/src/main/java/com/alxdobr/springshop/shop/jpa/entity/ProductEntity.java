package com.alxdobr.springshop.shop.jpa.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Product")
@NamedQuery(name="getAllProducts", query = "SELECT p FROM Product p")
@Table(name = "Product")
public class ProductEntity {

    private Integer id;
    private String name;
    private Double price;
    private CurrencyEntity currencyEntity;
    private UnitMeasureEntity unitMeasureEntity;

    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, Double price) {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CURRENCY_ID")
    public CurrencyEntity getCurrencyEntity() {
        return currencyEntity;
    }

    public void setCurrencyEntity(CurrencyEntity currencyEntity) {
        this.currencyEntity = currencyEntity;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UNITMEASURE_ID")
    public UnitMeasureEntity getUnitMeasureEntity() {
        return unitMeasureEntity;
    }

    public void setUnitMeasureEntity(UnitMeasureEntity unitMeasureEntity) {
        this.unitMeasureEntity = unitMeasureEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity productEntity = (ProductEntity) o;
        return Objects.equals(id, productEntity.id) &&
                Objects.equals(name, productEntity.name) &&
                Objects.equals(price, productEntity.price) &&
                Objects.equals(currencyEntity, productEntity.currencyEntity) &&
                Objects.equals(unitMeasureEntity, productEntity.unitMeasureEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, currencyEntity, unitMeasureEntity);
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", currencyEntity=" + currencyEntity +
                ", unitMeasureEntity=" + unitMeasureEntity +
                '}';
    }
}
