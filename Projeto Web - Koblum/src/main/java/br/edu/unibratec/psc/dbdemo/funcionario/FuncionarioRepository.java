package br.edu.unibratec.psc.dbdemo.funcionario;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 */
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}