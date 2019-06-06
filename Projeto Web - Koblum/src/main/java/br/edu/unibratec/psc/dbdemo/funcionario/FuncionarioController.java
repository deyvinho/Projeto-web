package br.edu.unibratec.psc.dbdemo.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/Cliente")
// http://localhost:8080/Cliente
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository FuncionarioRepository;

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Funcionario> getCliente() {
        return FuncionarioRepository.findAll();
    }

}
