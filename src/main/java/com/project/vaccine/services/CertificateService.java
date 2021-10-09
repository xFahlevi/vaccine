/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.services;

import com.project.vaccine.interfaces.CertificateInterface;
import com.project.vaccine.models.Certificate;
import com.project.vaccine.repositories.CertificateRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xFahlevi
 */
@Service
public class CertificateService implements CertificateInterface {

    @Autowired
    private CertificateRepository certificateRepository;
    
    @Override
    public List<Certificate> getAll() {
        return certificateRepository.findAll();
    }

    @Override
    public void store(Certificate certificate) {
        this.certificateRepository.save(certificate);
    }
    
    @Override
public Certificate getById(long id) {
  Optional < Certificate > optional = certificateRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Certificate not found for id :: " + id);
  }

  Certificate certificate = optional.get();
  return certificate;
}

@Override
public void delete(long id) {
  this.certificateRepository.deleteById(id);
}

}
