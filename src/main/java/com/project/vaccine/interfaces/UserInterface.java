/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.interfaces;

import com.project.vaccine.models.User;
import java.util.List;

/**
 *
 * @author xFahlevi
 */
public interface UserInterface {
    List<User> getAll();
    void store(User user);
    User getByNik(long nik);
    void delete(long nik);

    public User auth(String name, long phone_number);

    public void register(User user);
}
