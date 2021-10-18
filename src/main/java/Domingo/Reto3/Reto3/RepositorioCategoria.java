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
public class RepositorioCategoria {
    
        @Autowired
    private InterfaceCategoria crud2;
    
    public List<Categoria> getALL(){
        return (List<Categoria>) crud2.findAll();
    }
    
    public Optional<Categoria> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public Categoria save(Categoria categoria){
        return crud2.save(categoria);
    }
    
    public void delete(Categoria categoria){
        crud2.delete(categoria);
    }
}
