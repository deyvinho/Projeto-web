package br.edu.unibratec.psc.dbdemo.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/produto")
// http://localhost:8080/produto
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository ProdutoRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Produto> getproduto(){
        return ProdutoRepository.findAll();
    }

}