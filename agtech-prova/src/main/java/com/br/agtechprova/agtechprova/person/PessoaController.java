package com.br.agtechprova.agtechprova.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired // é o mesmo que dar um new > private PessoaService service = new PessoaService();
    private PessoaService service;

    // quando der (http://localhost:8080/pessoa) cai no método abaixo > lista de pessoas
    @RequestMapping(method = RequestMethod.GET,  // TIPO GET
            produces = MediaType.APPLICATION_JSON_VALUE)  // produz JSON
    public List<Pessoa> findAll() {
        return service.findAll();
    }


    // quando der http://localhost:8080/pessoa/id) cai no método abaixo
    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET, // TIPO GET
            produces = MediaType.APPLICATION_JSON_VALUE) // Produz JSON
    public Pessoa procuraPorId(@PathVariable("id") String id) {
        return service.procuraPorId(id);
    }

    //
    @RequestMapping(method = RequestMethod.POST,            // TIPO POST
            consumes = MediaType.APPLICATION_JSON_VALUE,   // consome JSON
            produces = MediaType.APPLICATION_JSON_VALUE)   // produz JSON
    public Pessoa create(@RequestBody Pessoa pessoa) {     // @RequestBody > corpo da requisição
        return service.create(pessoa);  // chama o service > cria o objeto > devolve JSON
    }


    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE )                 // TIPO DELETE
    public void delete(@PathVariable("id") String id) {     // metodo void não retorna valor;
        service.delete(id);  // chama o service > deleta o objeto > devolve JSON
    }

}
