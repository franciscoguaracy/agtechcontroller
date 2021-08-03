package com.br.agtechprova.agtechprova.modelocliente;

public class Cliente {

    // criando os atributos
    private int id;
    private String nome;
    private String cpf;

    // gerando o método construtor que por convenção tem o mesmo nome da classe
    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    // gerando os métodos getters() and setters()
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}