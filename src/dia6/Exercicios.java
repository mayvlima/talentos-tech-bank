package dia6;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Instant start = Instant.now();

        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }

        Arrays.sort(arr);
        //bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

        sortString();
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

    public static int[] selectSortPtBr(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indice_com_menor_valor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indice_com_menor_valor]) {
                    indice_com_menor_valor = j;
                }
            }

            int temporario = vetor[indice_com_menor_valor];
            vetor[indice_com_menor_valor] = vetor[i];
            vetor[i] = temporario;
        }

        return vetor;
    }

    public static void selectSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void sortString() {
        String[] palavras = {"Banana", "Maça", "Uva", "Amora", "Ameixa"};

        System.out.println(Arrays.toString(palavras));

        Arrays.sort(palavras);

        System.out.println(Arrays.toString(palavras));
    }


}
