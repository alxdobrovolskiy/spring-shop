package com.alxdobr.springshop.shop.model;

public class Currency {

    private String name;
    private Integer code;

    public Currency() {
    }

    public Currency(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CurrencyEntity{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
