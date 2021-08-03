package com.br.agtechprova.agtechprova.saudacao;

import javax.xml.crypto.Data;

// nome da classe Saudacao
public class Saudacao {

    // declara os atributos

    //private final long id;
    private final String nome;


    // nome do método construtor Saudacao (mesmo nome da classe)

    public Saudacao(String nome) {
        this.nome = nome;
    }

    // gerar o método getter()

    public String getNome() {
        return nome;
    }
}
