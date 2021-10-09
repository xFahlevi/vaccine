/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.repositories;

import com.project.vaccine.models.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xFahlevi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    public void deleteByNik(long nik);

    public Optional<User> findByNik(long nik);

    public User findByPhonenumber(long phone_number);

    public User findByPhone_number(long phone_number);
    
}
