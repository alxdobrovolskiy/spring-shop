package com.alxdobr.springshop.shop.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "CURRENCY")
@Table(name = "CURRENCY")
public class CurrencyEntity {

    private Integer id;
    private String name;
    private Integer code;

    public CurrencyEntity() {
    }

    public CurrencyEntity(Integer id, String name, Integer code) {
        this.id = id;
        this.name = name;
        this.code = code;
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

    @Column(name = "CODE")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyEntity currency = (CurrencyEntity) o;
        return Objects.equals(id, currency.id) &&
                Objects.equals(name, currency.name) &&
                Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }

    @Override
    public String toString() {
        return "CurrencyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
