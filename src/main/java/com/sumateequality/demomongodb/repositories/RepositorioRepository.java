
package com.sumateequality.demomongodb.repositories;

import com.sumateequality.demomongodb.models.Repositorio;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Paula
 */

@Repository
public interface RepositorioRepository extends MongoRepository<Repositorio, String>{

    public abstract List<Repositorio> findByUsername(String username);
    
    //ToDo: with like
}
