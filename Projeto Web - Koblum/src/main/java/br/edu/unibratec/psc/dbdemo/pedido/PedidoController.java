package br.edu.unibratec.psc.dbdemo.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/pedido")
// http://localhost:8080/produto
public class PedidoController {
    
    @Autowired
    private PedidoRepository PedidoRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Pedido> getpedido(){
        return PedidoRepository.findAll();
    }

}