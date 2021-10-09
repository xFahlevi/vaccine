/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.services;

import com.project.vaccine.interfaces.AdminInterface;
import com.project.vaccine.models.Admin;
import com.project.vaccine.repositories.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xFahlevi
 */
@Service
public class AdminService implements AdminInterface {

    @Autowired
    private AdminRepository adminRepository;
    
    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    @Override
    public void store(Admin admin) {
        this.adminRepository.save(admin);
    }
    
    @Override
public Admin getById(long id) {
  Optional < Admin > optional = adminRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Admin not found for id :: " + id);
  }

  Admin admin = optional.get();
  return admin;
}

@Override
public void delete(long id) {
  this.adminRepository.deleteById(id);
}

}
