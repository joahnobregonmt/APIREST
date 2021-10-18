/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domingo.Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JSKing1992
 *
 */
@Repository
public class RepositorioReservacion {
        @Autowired
    private InterfaceReservacion crud4;
    
    public List<Reservacion> getALL(){
        return (List<Reservacion>) crud4.findAll();
    }
    
    public Optional<Reservacion> getReservacion(int id){
        return crud4.findById(id);
    }
    
    public Reservacion save(Reservacion reservacion){
        return crud4.save(reservacion);
    }
    
    public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }
    
}
