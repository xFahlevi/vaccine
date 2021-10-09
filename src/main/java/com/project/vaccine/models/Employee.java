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
import javax.persistence.Table;

/**
 *
 * @author xFahlevi
 */
@Entity
@Table(name="employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long employee_id;
    
    
    @Column(name="phone_number")
    private long phone_number;
    
    @Column(name="name")
    private String name;
    
    @Column(name="job_desk")
    private String job_desk;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJob_desk(String job_desk) {
        this.job_desk = job_desk;
    }

    public String getJob_desk() {
        return job_desk;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }
    
    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public long getPhone_number() {
        return phone_number;
    }
}
