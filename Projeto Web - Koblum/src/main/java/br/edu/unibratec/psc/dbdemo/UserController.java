package br.edu.unibratec.psc.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/user")
// http://localhost:8080/user
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<User> getUsers(){
        return userRepository.findAll();
    }

}