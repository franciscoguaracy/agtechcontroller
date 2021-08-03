package com.br.agtechprova.agtechprova.provateste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransferScheduleRequest {

    private String accountOrigin; 		// conta de origem
    private String accountDestiny; 		// conta de destino
    private BigDecimal valTransf; 		// valor da transferencia
    private Double rateCalculated; 		// taxa a ser calculada
    private LocalDate transfDate; 		// data da transferencia
    private LocalDate appointmentDate; 	// data do agendamento

    public TransferScheduleRequest(String accountOrigin, String accountDestiny, BigDecimal valTransf, Double rateCalculated, LocalDate transfDate, LocalDate appointmentDate) {
        this.accountOrigin = accountOrigin;
        this.accountDestiny = accountDestiny;
        this.valTransf = valTransf;
        this.rateCalculated = rateCalculated;
        this.transfDate = transfDate;
        this.appointmentDate = appointmentDate;
    }

    public String getAccountOrigin() {
        return accountOrigin;
    }
    public void setAccountOrigin(String accountOrigin) {
        this.accountOrigin = accountOrigin;
    }

    public String getAccountDestiny() {
        return accountDestiny;
    }
    public void setAccountDestiny(String accountDestiny) {
        this.accountDestiny = accountDestiny;
    }

    public BigDecimal getValTransf() {
        return valTransf;
    }
    public void setValTransf(BigDecimal valTransf) {
        this.valTransf = valTransf;
    }

    public Double getRateCalculated() {
        return rateCalculated;
    }
    public void setRateCalculated(Double rateCalculated) {
        this.rateCalculated = rateCalculated;
    }

    public LocalDate getTransfDate(){
        return transfDate;
    }
    public void setTransfDate(LocalDate transfDate) {
        this.transfDate = transfDate;
    }

}

