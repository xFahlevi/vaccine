/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.vaccine.interfaces;

import com.project.vaccine.models.Location;
import java.util.List;

/**
 *
 * @author xFahlevi
 */
public interface LocationInterface {
    List<Location> getAll();
    void store(Location location);
    Location getById(long id);
    void delete(long id);
}
