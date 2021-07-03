package dia4;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio2();
    }

    public static void validadaSystemIn(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        //Faça um programa que calcula o exponencial a partir de sua base e sua potência

        Scanner sc = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Qual será a base?");
        validadaSystemIn(sc);

        int base = sc.nextInt();

        System.out.println("Qual será a potência?");
        validadaSystemIn(sc);

        int potencia = sc.nextInt();

        for (int i = 1; i <= potencia; i++) {
            resultado *= base;
        }

       /* while(potencia >= 1){
            resultado = resultado * base;
            potencia--;
        }*/

        System.out.printf("O número %d na base %d é igual a = %d", base, potencia, resultado);

        sc.close();
    }

    public static void exercicio2() {
        exercicio2i();
        exercicio2ii();
        exercicio2iii();
        exercicio2iv();
        exercicio2v();
        exercicio2vi();
    }

    public static void exercicio2i() {

        System.out.println("Item i)");

        for (int i = 0; i <= 4; i++) {
            System.out.println("**********");
        }

    }

    public static void exercicio2ii() {
        System.out.println("\nItem ii)");

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void exercicio2iii() {
        System.out.println("\nItem iii)");

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int k = linhas - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


    }

    public static void exercicio2iv() {
        System.out.println("\nItem iv)");

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;

            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2v() {
        System.out.println("\nItem v)");

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2vi() {
        System.out.println("\nItem v)");

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {

                System.out.printf("%d ", l);
                k++;

                if(l > 1 && estaDecrementando ){
                    l--;
                }else{
                    estaDecrementando = false;
                    l++;
                }
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2VIVirginia() {
        int rows = 5;
        System.out.println("");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }

}
