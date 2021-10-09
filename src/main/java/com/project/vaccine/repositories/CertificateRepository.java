/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.repositories;

import com.project.vaccine.models.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xFahlevi
 */
@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{
    
}
