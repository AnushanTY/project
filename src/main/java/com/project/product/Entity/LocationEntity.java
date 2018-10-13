package com.project.product.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Location")
public class LocationEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", updatable = false, nullable = false)
    private Long location_id ;
    @NotNull
    @Column(name = "stat_lat")
    private String stat_lat;

    @NotNull
    @Column(name = "sta_lng")
    private String sta_lng;

    @NotNull
    @Column(name = "end_lat")
    private String end_lat;

    @NotNull
    @Column(name = "end_lng")
    private String end_lng;



    public void setStat_lat(String stat_lat) {
        this.stat_lat = stat_lat;
    }

    public void setSta_lng(String sta_lng) {
        this.sta_lng = sta_lng;
    }

    public void setEnd_lat(String end_lat) {
        this.end_lat = end_lat;
    }

    public void setEnd_lng(String end_lng) {
        this.end_lng = end_lng;
    }



    public String getStat_lat() {
        return stat_lat;
    }

    public String getSta_lng() {
        return sta_lng;
    }

    public String getEnd_lat() {
        return end_lat;
    }

    public String getEnd_lng() {
        return end_lng;
    }

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
    }
}
