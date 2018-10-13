package com.project.product.Entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", updatable = false, nullable = false)
    private Long product_id;


    @NotNull
    @Column(name = "product_name")
    private String product_name;

    @NotNull
    @Column(name = "product_type")
    private String product_type;

    public Long getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
}
