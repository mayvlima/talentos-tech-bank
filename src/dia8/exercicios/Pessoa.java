package dia8.exercicios;

public class Pessoa {

    //Crie uma classe para representar uma pessoa, com os atributos de nome,
    // ano de nascimento e altura. Crie e também um método para imprimir
    // todos dados de uma pessoa.
    // Crie um método para mostrar quantos anos a pessoa fará/terá neste ano.

    String nome;
    int ano;
    float altura;

    public Pessoa(String nome, int ano, float altura) {
        this.nome = nome;
        this.ano = ano;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                "\nAno de Nascimento: " + ano +
                "\nAltura: " + altura + "\n\n*************\n";
    }

    public int quantosAnosEm2021() {
        return (2021 - this.ano);
    }
}
