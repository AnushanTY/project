package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Depots")
public class DepotsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depots_id", updatable = false, nullable = false)
    private Long depots_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transport_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TransportEntity transportEntity;

    public void setDepots_id(Long depots_id) {
        this.depots_id = depots_id;
    }

    public void setTransportEntity(TransportEntity transportEntity) {
        this.transportEntity = transportEntity;
    }

    public Long getDepots_id() {
        return depots_id;
    }

    public TransportEntity getTransportEntity() {
        return transportEntity;
    }
}
