package br.edu.unibratec.psc.dbdemo.endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/endereco")
// http://localhost:8080/endereco
public class EnderecoController {
    
    @Autowired
    private EnderecoRepository EnderecoRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Endereco> getendereco(){
        return EnderecoRepository.findAll();
    }

}