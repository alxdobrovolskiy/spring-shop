package com.alxdobr.springshop.shop.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "UNITMEASURE")
@Table(name = "UNITMEASURE")
public class UnitMeasureEntity {

    private Integer id;
    private String name;

    public UnitMeasureEntity() {
    }

    public UnitMeasureEntity(Integer id, String name) {
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
        UnitMeasureEntity that = (UnitMeasureEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String   toString() {
        return "UnitMeasureEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
