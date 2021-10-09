/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author xFahlevi
 */
@Entity
@Table(name="certificate")
public class Certificate {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long certificate_id;
    
     @OneToOne
    @JoinColumn(name="admin_id")
    private Admin admin_id;
     
     @OneToOne
    @JoinColumn(name="location_id")
    private Location location_id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="birth_date")
    private String birth_date;
    
    @Column(name="status")
    private String status;
    
    @Column(name="vaccine_type")
    private String vaccine_type;
    
    @Column(name="service_place")
    private String service_place;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setCertificate_id(long certificate_id) {
        this.certificate_id = certificate_id;
    }

    public long getCertificate_id() {
        return certificate_id;
    }

    public Admin getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Admin admin_id) {
        this.admin_id = admin_id;
    }

    public Location getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Location location_id) {
        this.location_id = location_id;
    }
    
   
    
     public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
     public void setVaccine_type(String vaccine_type) {
        this.vaccine_type = vaccine_type;
    }

    public String getVaccine_type() {
        return vaccine_type;
    }
    
     public void setService_place(String service_place) {
        this.service_place = service_place;
    }

    public String getService_place() {
        return service_place;
    }
}
