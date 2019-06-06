package br.edu.unibratec.psc.dbdemo.cliente;

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
public class ClienteController {
    
    @Autowired
    private ClienteRepository ClienteRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Cliente> getCliente(){
        return ClienteRepository.findAll();
    }

}

