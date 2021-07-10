package dia8.exercicios;

import java.time.Year;
import java.util.Objects;

public class Pessoa {

    //Crie uma classe para representar uma pessoa, com os atributos de nome,
    // ano de nascimento e altura. Crie e também um método para imprimir
    // todos dados de uma pessoa.
    // Crie um método para mostrar quantos anos a pessoa fará/terá neste ano.

    private String nome;
    private Integer anoDeNascimento;
    private Double altura;
    private String numeroDeCelular;

    public Pessoa(String nome, Integer anoDeNascimento, Double altura, String numeroDeCelular) {
        this.setNome(nome);
        this.setAnoDeNascimento(anoDeNascimento);
        this.setAltura(altura);
        this.setNumeroDeCelular(numeroDeCelular);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(Integer ano) {
        this.anoDeNascimento = ano;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(String numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }

    public int quantosAnosEm2021() {
        return (2021 - this.getAnoDeNascimento());
    }

    public void quantosAnosNoAnoAtual() {
        if (this.getAnoDeNascimento() == null) {
            System.out.println("Ano de nascimento não informado!");
        } else {
            Integer anoAtual = Year.now().getValue();
            Integer anosQueAhPessoaTera = anoAtual - this.getAnoDeNascimento();
            System.out.println(anosQueAhPessoaTera);
        }

    }

    @Override
    public String toString() {
        return "Nome: '" + this.getNome() + '\'' +
                "\nAno de Nascimento: " + this.getAnoDeNascimento() +
                "\nAltura: " + this.getAltura() +
                "\nNúmero de celular: " + this.getNumeroDeCelular() + "\n\n*************\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getNumeroDeCelular(), pessoa.getNumeroDeCelular());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroDeCelular());
    }
}
