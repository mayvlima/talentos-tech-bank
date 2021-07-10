package dia8.exercicios;

import java.util.*;

public class Agenda {
    //    Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
    //    void armazenaPessoa(String nome, int ano, float altura);
    //    void removePessoa(String nome);
    //    int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
    //    void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    //    void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

    private Set<Pessoa> contatos;

    public Agenda() {
        this.contatos = new HashSet<>();
    }

    public void armazenaPessoa(String nome, Integer ano, Double altura, String numeroDeCelular) {
        if (contatos.size() < 10) {
            contatos.add(new Pessoa(nome, ano, altura, numeroDeCelular));
            System.out.println("Cadastro realizado com sucesso!\n");
        } else {
            System.out.println("Agenda Lotada!\n");
        }
    }

    public void removePessoa(String nome, String numeroDoCelular) {
        Pessoa pessoaParaRemover = new Pessoa(nome, null, null, numeroDoCelular);
        if (contatos.remove(pessoaParaRemover)) {
            System.out.println("Contato removido com sucesso!\n");
        } else {
            System.out.println("Contato com esses dados não encontrado!\n");
        }
    }

    public List<Pessoa> buscaPessoa(String nome) {
        List<Pessoa> pessoasEncontradas = new ArrayList<>();

        for (Pessoa pessoa : contatos) {
            if (pessoa.getNome().contains(nome)) {
                pessoasEncontradas.add(pessoa);
            }
        }
        return pessoasEncontradas;
    }

    public void imprimeAgenda() {
        for (Pessoa pessoa : contatos) {
            System.out.println(pessoa);
        }
    }

    public void listaBuscaDePessoasPeloNome(String nome) {
        List<Pessoa> pessoasEncontradas = this.buscaPessoa(nome);

        if (!pessoasEncontradas.isEmpty()) {
            for (Pessoa pessoa : pessoasEncontradas) {
                System.out.println(pessoa);
            }
        } else {
            System.out.println("Contatos com esse nome não foram encontrados!\n");
        }
    }


}
