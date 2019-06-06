package br.edu.unibratec.psc.dbdemo.fornecedor;

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
public class FornecedorController {

    @Autowired
    private FornecedorRepository FornecedorRepository;

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Fornecedor> getCliente() {
        return FornecedorRepository.findAll();
    }

}
