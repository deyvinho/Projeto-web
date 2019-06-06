package br.edu.unibratec.psc.dbdemo.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/usuario")
// http://localhost:8080/usuario
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository UsuarioRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Usuario> getusuario(){
        return UsuarioRepository.findAll();
    }

}