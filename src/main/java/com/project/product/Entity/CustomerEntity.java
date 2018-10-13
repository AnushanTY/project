package com.project.product.Entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class CustomerEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", updatable = false, nullable = false)
    private Long customer_id;


    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "username" , unique = true)
    private String username;

    @Column(name = "password")
    @NotNull
    private String password;

    public Long getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}




