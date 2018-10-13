package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Category3_Entity")
public class Category3_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category3_id", updatable = false, nullable = false)
    private Long Category3_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private  CustomerEntity customerEntity;

    public Long getCategory3_id() {
        return Category3_id;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCategory3_id(Long category3_id) {
        Category3_id = category3_id;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
