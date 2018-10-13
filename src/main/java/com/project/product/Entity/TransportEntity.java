package com.project.product.Entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Trasport")
public class TransportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trasport_id", updatable = false, nullable = false)
    private Long trasport_id;


    @NotNull
    @Column(name = "lorry_id")
    private String lorry_id;

    @NotNull
    @Column(name = "container_id")
    private String container_id;

    @NotNull
    @Column(name = "driver_id")
    private String driver_id;

    @NotNull
    @Column(name = "assistant_id")
    private String assistant_id;

    public Long getTrasport_id() {
        return trasport_id;
    }

    public String getLorry_id() {
        return lorry_id;
    }

    public String getContainer_id() {
        return container_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public String getAssistant_id() {
        return assistant_id;
    }

    public void setTrasport_id(Long trasport_id) {
        this.trasport_id = trasport_id;
    }

    public void setLorry_id(String lorry_id) {
        this.lorry_id = lorry_id;
    }

    public void setContainer_id(String container_id) {
        this.container_id = container_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public void setAssistant_id(String assistant_id) {
        this.assistant_id = assistant_id;
    }
}
