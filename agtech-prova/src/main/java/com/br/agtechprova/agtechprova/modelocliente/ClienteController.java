package com.br.agtechprova.agtechprova.modelocliente;

import org.springframework.web.bind.annotation.*;


/*@RequestMapping(path = "/clientes") // pode definir o caminho colocando o path = ;*/

@RestController
@RequestMapping("/clientes") // não há necessidade de colocar o path como no exemplo acima;
public class ClienteController { // toda a classe ClienteController está mapeada para a barra "/clientes"

    // criar o método do tipo Cliente com o nome obterCliente()

    @GetMapping("/qualquer")
    public Cliente obterCLiente() {
        return new Cliente(45, "Francisco", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "222.665.654-99");
    }


    @GetMapping // sem declarar o endpoint no GetMapping (URL http://localhost:8080/clientes?id=3000)
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Joel Silva", "112.221.665-88");
    }


}
