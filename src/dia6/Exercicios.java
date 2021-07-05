package dia6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        sort();
    }

    public static void validadaSystemIn(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // Dado um array com 20 números, imprima seus valores de trás para frente.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual será o tamanho do Array: ");
        validadaSystemIn(sc);

        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            validadaSystemIn(sc);

            numeros[i] = sc.nextInt();
        }

        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }

    public static void sort() {
        int[] array = {30, -55, 35, 7, 18, 0, 543, 35, 15, 2, -11, -15, -15};

        for (int i = 0; i < array.length; i++) {
            int numero = array[i];
            int posicao = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < numero) {
                    numero = array[j];
                    posicao = j;
                }
            }
            array[posicao] = array[i];
            array[i] = numero;
        }

        System.out.println(Arrays.toString(array));

    }

}
