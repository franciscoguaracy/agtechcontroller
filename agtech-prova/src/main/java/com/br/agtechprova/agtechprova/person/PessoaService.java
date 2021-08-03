package com.br.agtechprova.agtechprova.person;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;



/* Os Services são responsáveis pela lógica de negócio da sua aplicação, além de ser responsável por
 se comunicar com as camadas mais internas do Software, como por exemplo, uma camada de Dados.*/

@Service /* anotaçao que serve para que o Spring cuide da injeção de dependencia (@Autowired) dessa classe onde for necessário */
public class PessoaService {

    private final AtomicLong contador = new AtomicLong();  // Simular um id do banco de dados (gerar um id novo)

    public Pessoa create(Pessoa pessoa){ // cria um método create() do tipo Pessoa que retorna pessoa
        return pessoa;
    }

    public Pessoa update(Pessoa pessoa){ // cria um método update) do tipo Pessoa que retorna pessoa
        return pessoa;
    }

    // metodo void sem retorno
    public void delete(String id){ // cria um método delete() do tipo Pessoa que retorna pessoa
    }


    public Pessoa procuraPorId(String id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(contador.incrementAndGet()); // gerar o numero e incrementá-lo
        pessoa.setPrimNome("Ayrton");
        pessoa.setSegNome("Senna");
        pessoa.setEndereco("São Paulo - SP - Brasil");
        pessoa.setGenero("Masculino");
        return pessoa;
    }

    // retorna um Mock (por não possuir uma base de dados)

        /*
        Objetos mock, objetos simulados ou simplesmente mock (do inglês mock object) em desenvolvimento de software
        são objetos que simulam o comportamento de objetos reais de forma controlada.
        São normalmente criados para testar o comportamento de outros objetos.
         */

    public List<Pessoa> findAll() {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        for (int i = 0; i < 8; i++) { // o for vai de zero a sete
            Pessoa pessoa = mockPessoa(i);
            pessoas.add(pessoa);
        }
        return pessoas;
    }

    private Pessoa mockPessoa(int i) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(contador.incrementAndGet()); // gerar o numero e incrementá-lo
        pessoa.setPrimNome("Pessoa nome" + i);
        pessoa.setSegNome("Sobrenome" + i);
        pessoa.setEndereco("Algum endereço no Brasil" + i);
        pessoa.setGenero("Masculino");
        return pessoa;
    }

}
