package br.edu.unibratec.psc.dbdemo.produto;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 */
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    
}