
package com.sumateequality.demomongodb.services;

import com.sumateequality.demomongodb.models.Repositorio;
import com.sumateequality.demomongodb.repositories.RepositorioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Paula
 */

@Service
public class RepositorioService {
    
    @Autowired
    private RepositorioRepository repositorioRepository;
    
    public Repositorio save(Repositorio repositorio){
        return repositorioRepository.save(repositorio);
    }
    
    public List<Repositorio> findAll() {
        return repositorioRepository.findAll();
    }
    
    public Optional<Repositorio> findById(String id){
        return repositorioRepository.findById(id);
    }
    
    public List<Repositorio> findByUsername(String username){
        return repositorioRepository.findByUsername(username);
    }
    
    public boolean deleteById(String id){
        try{
            repositorioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
