package dia2;

public class Main {

    public static void main(String[] args) {


    }

    public static void operadores() {
        // Atribuição
        int idade = 20;

        int i = 1 + 1; // + - * / ++ -- %

    }

    public static void primeiroIf() {
        int idade = 1000;
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade >= 150) {
            System.out.println("Idade inválida!");
        } else if (idade >= 18) {
            System.out.println("Você tem permissão para assistir esse conteúdo");
        } else {
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        }
    }

}
