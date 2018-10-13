package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(name = "Category2_Entity")
public class Category2_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category2_id", updatable = false, nullable = false)
    private Long Category2_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private  CustomerEntity customerEntity;

    public Long getCategory2_id() {
        return Category2_id;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCategory2_id(Long category2_id) {
        Category2_id = category2_id;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
