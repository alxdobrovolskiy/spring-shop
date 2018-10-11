package com.alxdobr.springshop.shop.model;

public class UnitMeasure {

    private String name;

    public UnitMeasure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UnitMeasure{" +
                "name='" + name + '\'' +
                '}';
    }
}
