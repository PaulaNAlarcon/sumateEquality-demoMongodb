package com.sumateequality.demomongodb.controllers;

import com.sumateequality.demomongodb.models.Repositorio;
import com.sumateequality.demomongodb.services.RepositorioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paula
 */
@RestController
@RequestMapping("/repositories")
public class RepositorioController {

    @Autowired
    private RepositorioService repositorioService;

    @PostMapping()
    public Repositorio save(@RequestBody Repositorio repositorio) {
        return repositorioService.save(repositorio);
    }

    @GetMapping()
    public List<Repositorio> findAll() {
        return repositorioService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Repositorio findById(@PathVariable String id) {
        return repositorioService.findById(id).get();
    }

    @GetMapping("/query")
    public List<Repositorio> findByUsername(@RequestParam("username") String username) {
        return repositorioService.findByUsername(username);
    }
    
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable String id) {
        boolean ok = repositorioService.deleteById(id);
        if (ok) {
            return "Se eliminó el repositorio con id= "+id;
        }else{
            return "No se pudo eliminar el repositorio";
        }
    }
    
}
