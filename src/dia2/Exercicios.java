package dia2;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio4();
    }

    public static void exercicio1() {
         /*1. Escreva um algoritmo que armazene o valor 99 em uma variável Y
        e o valor 11 em uma variável Z.
        A seguir (utilizando apenas atribuições entre variáveis)
        troque os seus conteúdos fazendo com que o valor que está
        em Y passe para Z e vice-versa. Ao final, escrever os valores
        que ficaram armazenados nas variáveis.*/

        short y = 99, z = 11, intermediario;

        System.out.printf("O valor da variável Y antes da troca é: %d \n", y);
        System.out.println("O valor da variável Z antes da troca é: " + z);

        intermediario = y;
        y = z;
        z = intermediario;

        System.out.println("\nO valor da variável Y depois da troca é: " + y);
        System.out.println("O valor da variável Z depois da troca é: " + z);
    }

    public static void exercicio2() {
        //Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor para mostrar seu antecessor: ");
        int valor = sc.nextInt();

        //int antecessor = valor - 1;

        System.out.println("O valor antecessor de " + valor + " é " + --valor);

        sc.close();
    }

    public static void exercicio3() {
        //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        // calcular e escrever a área do retângulo.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        Double base = sc.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        Double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("\nA área do triângulo de base = %.2f e altura = %.2f é igual a = %.2f", base, altura, area);

        sc.close();

    }

    public static void exercicio4() {
        //Escreva um algoritmo para ler o número total de eleitores de um município,
        // o número de votos brancos, nulos e válidos.
        // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de votos brancos: ");
        if(!sc.hasNextInt()){
            System.out.println("Você não digitou um valor válido, encerrando o programa....");
            System.exit(1);
        }
        int brancos = sc.nextInt();

        System.out.print("Digite o total de votos nulos: ");
        int nulos = sc.nextInt();

        System.out.print("Digite o total de votos válidos: ");
        int validos = sc.nextInt();

        int total = brancos + nulos + validos;

        double percentualValidos = validos * 100 / total;
        double percentualBrancos = brancos * 100 / total;
        double percentualNulos = nulos * 100 / total;

        System.out.println("\nA quantidade de votos total é = " + total);
        System.out.println("A quantidade de votos de validos é = " + validos);
        System.out.println("A quantidade de votos de brancos é = " + brancos);
        System.out.println("A quantidade de votos de nulos é = " + nulos);
        System.out.println("-----------------------------");

        System.out.println("\nA porcentagem de votos válidos é igual = " + percentualValidos + "%");
        System.out.println("A porcentagem de votos brancos é igual = " + percentualBrancos + "%");
        System.out.println("A porcentagem de votos nulos é igual = " + percentualNulos + "%");

        sc.close();

    }
}
