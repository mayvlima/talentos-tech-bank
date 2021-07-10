package dia12.abstratos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostrarValoresAPagar(List<Empregado> empregados){
        for(Empregado e : empregados){
            System.out.println(e);
            System.out.println(e.ganha());
        }
    }

    public static void main(String[] args) {

        List<Empregado> empregados = new ArrayList<>();

        empregados.add(new Chefe("Virgina Silva", 18_000));
        empregados.add(new PorComissao("Rafaela Ferreia", 5_000, 10, 200));
        empregados.add(new PorItem("Beatriz Rodrigues", 40, 180));
        empregados.add(new PorHora("Bruno Souza", 80, 300));
        empregados.add(new PorHora("Aretha Martins", 120, 310));

        mostrarValoresAPagar(empregados);
    }
}
