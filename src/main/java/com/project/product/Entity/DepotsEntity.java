package com.project.product.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Depots")
public class DepotsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depots_id", updatable = false, nullable = false)
    private Long depots_id;



}
