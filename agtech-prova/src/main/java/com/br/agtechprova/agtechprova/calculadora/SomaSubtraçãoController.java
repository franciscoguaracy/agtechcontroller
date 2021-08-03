package com.br.agtechprova.agtechprova.calculadora;

import com.br.agtechprova.agtechprova.modelocliente.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calcula")
public class SomaSubtraçãoController {

    @GetMapping("/somar/{a}/{b}") // passando os parametros na url (localhost:8080/calcula/somar/10/40)
      public int somar(@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    @GetMapping("/subtrair") // passando os parâmetros na url (localhost:8080/calcula/subtrair?b=100&a=30)
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }

}
