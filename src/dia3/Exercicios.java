package dia3;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio2ComRecursao();
    }

    public static void validadaSystemIn(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        //    Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //
        //    Encontre o maior valor
        //    Encontre o menor valor
        //    Calcule a média dos números lidos
        //    Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.

        Scanner sc = new Scanner(System.in);

        int numeroMaior = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int somatoria = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %d° número inteiro: ", (i));
            validadaSystemIn(sc);
            int numero = sc.nextInt();

            if (numero > numeroMaior) {
                numeroMaior = numero;
            } else if (numero < numeroMenor) {
                numeroMenor = numero;
            }

            somatoria += numero;
        }

        int media = somatoria / 10;

        System.out.println("\nO MAIOR número é: " + numeroMaior);
        System.out.println("O MENOR número é: " + numeroMenor);
        System.out.println("A MÉDIA é : " + media);

        sc.close();
    }

    public static void exercicio2() {
        //Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que você deseja saber o valor do seu fatorial: ");
        validadaSystemIn(sc);
        int numero = sc.nextInt();

        long resultado = 1;

        while (numero > 1) {
            resultado = numero * resultado;
            numero--;
        }

        System.out.printf("O fatorial é igual a  = %d", resultado);

        sc.close();

    }

    public static void exercicio2ComRecursao() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que você deseja saber o valor do seu fatorial: ");
        validadaSystemIn(sc);
        int numero = sc.nextInt();

        System.out.println(fatorialRecursivo(numero));

        sc.close();
    }

    public static double fatorialRecursivo(int x) {
        if (x == 0) {
            return 1;
        }
        return x * fatorialRecursivo(x - 1);
    }


}
