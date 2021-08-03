/* classe onde terá os pontos de entrada e saída para as nossas chamadas para API REST e vai conversar com
 * a parte referente a regra do negócio (Service)*/

// ctrl g - todos os lugares que é chamado
package com.br.agtechprova.agtechprova.provateste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@RestController
@RequestMapping("/agtech") //esse cara eh para todos que estao nessa classe de endpoints
public class TransferScheduleController {
    @Autowired
    private TransferScheduleService service;

    @PostMapping("/transfer")
    public String teste(@RequestBody TransferScheduleRequest transferencia) {
        return service.calcula(transferencia);
    }

    @PostMapping("/contadest")
    public String teste2(@RequestBody TransferScheduleRequest contadestino) {
        return service.calcula2(contadestino);
    }

    @PostMapping("/contadest/pay")
    public BigDecimal teste3(@RequestBody TransferScheduleRequest valortransferencia) {
        return service.calcula3(valortransferencia);
    }

    @GetMapping ("/date")
    public LocalDate teste4(@RequestParam TransferScheduleRequest dateagend) {
        return service.calcula4(dateagend);
    }

}

    /* A sintaxe para construção de um método é a seguinte:
  [modificador] tipo_retorno identificador ([argumentos]) {
   //Corpo do método
  }
  Exemplo:

     // metodo sempre recebe o tipo de obejto e nome do objeto como entrada
     Exemplo:
     tipo do objeto: TransferScheduleResquest
     nome do objeto: valortransferencia
     public BigDecimal calcula3(TranferScheduleRequest valortransferencia){


    // metodo quando chamado so tem o nome do objeto de entrada ex
     Exemplo:
     service.calcula3(valortransferencia)


    // DEBUG
    // F6 VAI PRA LINHA DA FRENTE
    // F8 VAI PRO FINAL
*/
