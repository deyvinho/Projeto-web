package br.edu.unibratec.psc.dbdemo.itempedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(path = "/itempedido")
// http://localhost:8080/itempedido
public class ItemPedidoController {
    
    @Autowired
    private ItemPedidoRepository ItemPedidoRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<ItemPedido> getitempedido(){
        return ItemPedidoRepository.findAll();
    }

}