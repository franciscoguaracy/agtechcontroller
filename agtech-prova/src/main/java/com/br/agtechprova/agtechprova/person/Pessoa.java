package com.br.agtechprova.agtechprova.person;

import java.io.Serializable;

public class Pessoa implements Serializable{  // a serialização é o processo onde o Java pega o valor
                                               // de cada atributo e gera uma sequência de bytes

private static final long serialVersionUID = 1L;
    // define atributos da pessoa (id, primeiroNome, segundoNome, endereço e genero)

    private Long id;
    private String primNome;
    private String segNome;
    private String endereco;
    private String genero;

    // método construtor:
    public Pessoa(){
    }

    // getters() and setters()


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimNome() {
        return primNome;
    }

    public void setPrimNome(String primNome) {
        this.primNome = primNome;
    }

    public String getSegNome() {
        return segNome;
    }

    public void setSegNome(String segNome) {
        this.segNome = segNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
