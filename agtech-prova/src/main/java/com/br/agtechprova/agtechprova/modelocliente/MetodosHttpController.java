// PROTOCOLO HTTP (CAMADA DE APLICAÇÃO) - BASEADO EM REQUISIÇÃO E RESPOSTA

// TUDO O QUE ESTÁ NUMA URL É UMA STRING

// POSSUI 8 MÉTODOS ASSOCIADOS A REQUISIÇÃO (comunicação entre o browser e a aplicação SPRING BOOT(servidor))
// GET > OBTER/ LER INFORMAÇÕES DO SERVIDOR/ NÃO MUDA O ESTADO DA APLICAÇÃO (+ UTILIZADO) > Reponse Body

//MÉTODOS QUE EFETUAM ALTERAÇÃO NO SERVIDOR:
// POST > INSERIR NOVOS DADOS NO SERVIDOR (+ UTILIZADO JUNTO COM GET)
// PUT > ALTERAR DADOS NO SERVIDOR (Alteração total ex: mexer em todos os atributos)
// PATCH > ALTERAR DADOS NO SERVIDOR (Alteração parcial ex: mexer especificamente em um atributo)
// DELETE > FAZER A EXCLUSÃO
// OPTIONS > TRAZER QUAIS SÃO OS MÉTODOS HTTP QUE A URL SUPORTA
// TRACE > FAZER UM REQUISIÇAO DE TESTE
// HEAD > PARECIDA COM GET mas NÃO VAI OBTER RESPOSTA (Corpo da requisição - response Body)

// Forma padrão de passar parâmetros a partir de uma requisiçao

     /* no caso do tipo GET os parâmetros vão diretamente na URL
     ex: https://www.google.com/search?q=Java+spring (o q é de query = consulta (termo de consulta)
         https://www.google.com/search?q=Java+spring&hl=en (hl = host language > linguagem da máquina cliente / en =english)

      no caso do tipo POST os parãmetros vão internamente dentro do corpo da requisição */

package com.br.agtechprova.agtechprova.modelocliente;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {


    @GetMapping
    public String get(){
        return "Requisição GET";
    }

    @PostMapping
    public String post(){
        return "Requisição POST";
    }

    @PutMapping
    public String put(){
        return "Requisição PUT";
    }

    @PatchMapping
    public String patch(){
        return "Requisição PATCH";
    }

    @DeleteMapping
    public String delete(){
        return "Requisição DELETE";
    }

}
