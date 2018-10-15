package com.alxdobr.springshop.shop.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UNITMEASURE")
public class UnitMeasure {

    private Integer id;
    private String name;

    public UnitMeasure(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasure that = (UnitMeasure) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "UnitMeasure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
