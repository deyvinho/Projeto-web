package br.edu.unibratec.psc.dbdemo;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    
}