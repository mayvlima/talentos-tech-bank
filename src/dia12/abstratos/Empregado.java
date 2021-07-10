package dia12.abstratos;

public abstract class Empregado {

    private String nome;

    public Empregado(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double ganha();

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
