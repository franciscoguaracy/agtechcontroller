package com.br.agtechprova.agtechprova.provateste;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferScheduleService {

        public String calcula(TransferScheduleRequest transferencia) {

            return transferencia.getAccountOrigin();
        }

        public String calcula2(TransferScheduleRequest contadestino){

            return contadestino.getAccountDestiny();
        }

        public BigDecimal calcula3(TransferScheduleRequest valortransferencia){

            return valortransferencia.getValTransf();
        }

}
