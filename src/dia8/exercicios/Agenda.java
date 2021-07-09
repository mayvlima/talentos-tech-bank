package dia8.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Agenda {
    //    Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
    //    void armazenaPessoa(String nome, int ano, float altura);
    //    void removePessoa(String nome);
    //    int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
    //    void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    //    void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

    List<Pessoa> contatos = new ArrayList<>();

    public void armazenaPessoa(String nome, int ano, float altura) {
        if (contatos.size() < 10) {
            contatos.add(new Pessoa(nome, ano, altura));
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Agenda Lotada!");
        }
    }

    public void removePessoa(String nome) {
        int id = buscaPessoa(nome);
        if (id != -1) {
            contatos.remove(id);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).nome.toLowerCase(Locale.ROOT).equals(nome.toLowerCase(Locale.ROOT).trim())) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for (int i = 0; i < contatos.size(); i++) {
            System.out.printf("ID: %d \n", i);
            System.out.println(contatos.get(i).toString());
        }
    }

    public void imprimePessoa(int index) {
        if(index >= contatos.size()){
            System.out.println("\nNão foi encontrado contato com esse número de ID!");
        }else{
            System.out.printf("\nID: %d \n", index);
            System.out.println(contatos.get(index).toString());
        }

    }
}
