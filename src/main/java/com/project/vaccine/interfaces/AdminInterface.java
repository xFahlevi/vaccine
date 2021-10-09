/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.interfaces;

import com.project.vaccine.models.Admin;
import java.util.List;

/**
 *
 * @author xFahlevi
 */
public interface AdminInterface {
    List<Admin> getAll();
    void store(Admin admin);
    Admin getById(long id);
    void delete(long id);
}
