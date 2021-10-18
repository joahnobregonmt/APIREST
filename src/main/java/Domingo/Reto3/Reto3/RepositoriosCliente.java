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
public class RepositoriosCliente {
    
        @Autowired
    private InterfaceCliente crud5;
    
    public List<Cliente> getALL(){
        return (List<Cliente>) crud5.findAll();
    }
    
    public Optional<Cliente> getCliente(int id){
        return crud5.findById(id);
    }
    
    public Cliente save(Cliente cliente){
        return crud5.save(cliente);
    }
    
    public void delete(Cliente cliente){
        crud5.delete(cliente);
    }
    
}
