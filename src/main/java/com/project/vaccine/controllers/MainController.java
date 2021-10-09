/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.controllers;

import com.project.vaccine.interfaces.CertificateInterface;
import com.project.vaccine.models.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author xFahlevi
 */
@Controller
public class MainController {

    @Autowired
    private CertificateInterface certificateInterface;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", certificateInterface.getAll());
        return "indexuser";
    }

    @GetMapping("/certificate/create")
    public String create(Model model) {
        
        Certificate certificate = new Certificate();
        model.addAttribute("certificate", certificate);
        
        return "createuser";
    }

    @PostMapping("/certificate/store")
    public String store(@ModelAttribute("certificate") Certificate certificate) {
        certificateInterface.store(certificate);
        return "redirect:/";
    }
    
    @GetMapping("/certificate/{nik}/edit")
public String edit(@PathVariable(value = "nik") long Nik, Model model) {
  Certificate certificate = certificateInterface.getById(Nik);

  model.addAttribute("certificate", certificate);
  return "edituser";
}

@PostMapping("/certificate/{nik}/delete")
public String delete(@PathVariable(value = "nik") long Nik) {
  certificateInterface.delete(Nik);
  return "redirect:/";
}
}
