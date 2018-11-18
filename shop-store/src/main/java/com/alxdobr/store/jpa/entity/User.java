package com.alxdobr.store.jpa.entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

//    @Id
//    @GeneratedValue
//    private Integer id;

    @Id
    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
