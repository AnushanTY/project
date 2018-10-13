package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Category1_Entity")
public class Category1_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category1_id", updatable = false, nullable = false)
    private Long Category1_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private  CustomerEntity customerEntity;

    public Long getCategory1_id() {
        return Category1_id;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCategory1_id(Long category1_id) {
        Category1_id = category1_id;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
