package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Job")
public class JobEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", updatable = false, nullable = false)
    private Long job_id;

    @NotNull
    @Column(name = "load_type")
    private String load_type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private  CustomerEntity customerEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private ProductEntity productEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transport_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TransportEntity transportEntity;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "depots_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private DepotsEntity depotsEntity;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private LocationEntity locationEntity;




    public String getLoad_type() {
        return load_type;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public TransportEntity getTransportEntity() {
        return transportEntity;
    }

    public DepotsEntity getDepotsEntity() {
        return depotsEntity;
    }

    public void setLoad_type(String load_type) {
        this.load_type = load_type;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public void setTransportEntity(TransportEntity transportEntity) {
        this.transportEntity = transportEntity;
    }

    public void setDepotsEntity(DepotsEntity depotsEntity) {
        this.depotsEntity = depotsEntity;
    }

    public Long getJob_id() {
        return job_id;
    }

    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }
}
