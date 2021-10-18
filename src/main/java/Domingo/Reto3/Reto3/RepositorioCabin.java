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
 */
@Repository
public class RepositorioCabin {
    @Autowired
    private InterfaceCabin crud;
    
    public List<Cabin> getALL(){
        return (List<Cabin>) crud.findAll();
    }
    
    public Optional<Cabin> getCabin(int id){
        return crud.findById(id);
    }
    
    public Cabin save(Cabin cabin){
        return crud.save(cabin);
    }
    
    public void delete(Cabin cabin){
        crud.delete(cabin);
    }
}
