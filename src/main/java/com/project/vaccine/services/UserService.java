/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.services;

import com.project.vaccine.interfaces.UserInterface;
import com.project.vaccine.models.User;
import com.project.vaccine.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xFahlevi
 */
@Service
public class UserService implements UserInterface {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private long nik;
    
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void store(User user) {
        this.userRepository.save(user);
    }
    
    @Override
    public User getByNik(long id) {
    Optional < User > optional = userRepository.findByNik(nik);

    if (!optional.isPresent()) {
    throw new RuntimeException(" User not found for nik :: " + nik);
     }

    User user = optional.get();
     return user;
    }

@Override
public void delete(long id) {
  this.userRepository.deleteByNik(nik);
}

    @Override
    public User auth(String name, long phone_number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void register(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}