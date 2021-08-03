package com.br.agtechprova.agtechprova.saudacao;

import com.br.agtechprova.agtechprova.saudacao.Saudacao;
import org.springframework.web.bind.annotation.*;


@RestController
public class SaudacaoController {


    // retornando Strings

    @RequestMapping(method = RequestMethod.GET, path = "/ola") // url que atende o método teste1()
    public String teste1() {
        return "Olá, testando @RequestMapping...";
    }

    @GetMapping(path = {"/hello", "/greeting"}) // duas urls que atendem para o mesmo método teste2()
    public String teste2() {
        return "Olá, testando o @GetMapping...";
    }


    private static final String ola = "Olá, %s!...utilizando o @RequestParam"; /* utiliza o especificador de formato %s, que indica
                                                                                  onde e que tipo de dado (no caso uma String) será mostrado
                                                                                  na saída a ser mostrada */

    @RequestMapping("/saudacao")
    public Saudacao saudacao(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) { // se não passar parâmetro na URL a saída default será Mundo
        return new Saudacao(String.format(ola, nome));                                     // passar o parâmetro nome a saída será a mensagem mais o nome
        // passado ex:> localhost:8080/saudacao?nome=francisco
    }
}














