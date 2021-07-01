package dia2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio6();
    }

    public static void exercicio1() {
        //Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }

        int numero = sc.nextInt();

        System.out.println("IF/ELSE");
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR");
        }

        System.out.println("\nSWITCH/CASE");

        int mod = numero % 2;

        switch (mod) {
            case 0:
                System.out.println("O número " + numero + " é PAR");
                break;
            default:
                System.out.println("O número " + numero + " é ÍMPAR");
                break;
        }

        System.out.println("\nIF/ELSE TERNÁRIO");
        String resultadoTernario = numero % 2 == 0 ? "O número " + numero + " é PAR" : "O número " + numero + " é ÍMPAR";
        System.out.println(resultadoTernario);

        sc.close();
    }

    public static void exercicio2() {
        //    Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
        //    Infantil A = 5 a 7 anos
        //    Infantil B = 8 a 11 anos
        //    Juvenil A = 12 a 13 anos
        //    Juvenil B = 14 a 17 anos
        //    Adultos = Maiores de 18 anos

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }

        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador faz parte da categoria INFANTIL A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("O nadador faz parte da categoria INFANTIL B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("O nadador faz parte da categoria JUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador faz parte da categoria JUVENIL B");
        } else if (idade >= 18) {
            System.out.println("O nadador faz parte da categoria ADULTOS");
        } else {
            System.out.println("Idade não permitida");
        }

        sc.close();
    }

    public static void exercicio3() {
        //Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
        //Escreva um algoritmo que determina o maior também.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int n2 = sc.nextInt();

        System.out.println("\nMétodo que determina o MENOR");
        if (n1 > n2) {
            System.out.println("O número " + n2 + " é MENOR do que o número " + n1);
        } else if (n1 == n2) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("O número " + n1 + " é MENOR do que o número " + n2);
        }

        System.out.println("\nMétodo que determina o MAIOR");
        if (n1 > n2) {
            System.out.println("O número " + n1 + " é MAIOR do que o número " + n2);
        } else if (n1 == n2) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("O número " + n2 + " é MAIOR do que o número " + n1);
        }

        sc.close();
    }

    public static void exercicio4() {
        //    Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //    Encontre o maior valor
        //    Encontre o menor valor
        //    Calcule a média dos números lidos

        int[] numeros = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° número inteiro: ", (i + 1));

            if (!sc.hasNextInt()) {
                System.out.println("Você precisa informar um número do tipo inteiro");
                sc.close();
                System.exit(1);
            }
            numeros[i] = sc.nextInt();
        }

        int numeroMaior = numeros[1];
        int numeroMenor = numeros[1];
        int somatoria = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMaior) {
                numeroMaior = numeros[i];
            } else if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
            somatoria = somatoria + numeros[i];
        }

        int media = somatoria / 10;

        System.out.println("O MAIOR número é: " + numeroMaior);
        System.out.println("O MENOR número é: " + numeroMenor);
        System.out.println("A MÉDIA é : " + media);

        sc.close();
    }

    public static void exercicio5() {
        //Escreva um algoritmo em Java que seja capaz de fazer as seguintes
        // operações matemáticas (adição, subtração, multiplicação e divisão).
        // Todas as operações serão entre dois valores.
        // No começo do algoritmo pergunte ao usuário
        // qual operação ele deseja fazer e quais são os valores.

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação você deseja fazer? Digite: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int escolha = sc.nextInt();

        System.out.print("\nDigite o primeiro número: ");
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int n2 = sc.nextInt();

        switch (escolha){
            case 1:
                int soma = n1 + n2;
                System.out.println("\n" + n1 + " + " + n2 + " = " + soma  );
                break;
            case 2:
                int subtacao = n1 - n2;
                System.out.println("\n" + n1 + " - " + n2 + " = " + subtacao  );
                break;
            case 3:
                int multiplicacao = n1 * n2;
                System.out.println("\n" + n1 + " * " + n2 + " = " + multiplicacao  );
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("\nNão é possível dividir por zero");
                    break;
                }else{
                    int divisao = n1/n2;
                    System.out.println("\n" + n1 + " / " + n2 + " = " + divisao  );
                    break;
                }
        }

        sc.close();
    }

    public static void exercicio6() {
        //Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
        // O algoritmo deverá perguntar qual é a escolha do jogador 1
        // (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2.
        // No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao JOKEMPÔ");
        System.out.println("Jogador 1 digite: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int j1 = sc.nextInt();

        System.out.println("Jogador 2 digite: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
        int j2 = sc.nextInt();

        //TODO tentar melhorar esses ifs

        if(j1 == 1 && j2 == 2){
            System.out.println("Papel vence pedra");
            System.out.println("Jogador 2 é o vencedor");
        }else if(j1 == 1 && j2 == 3){
            System.out.println("Pedra vence tesoura");
            System.out.println("Jogador 1 é o vencedor");
        }else if(j1 == 2 && j2 == 1 ){
            System.out.println("Papel vence pedra");
            System.out.println("Jogador 1 é o vencedor");
        }else if(j1 == 2 && j2 == 3 ) {
            System.out.println("Tesoura vence papel");
            System.out.println("Jogador 2 é o vencedor");
        }else if(j1 == 3 && j2 == 1 ) {
            System.out.println("Pedra vence tesoura");
            System.out.println("Jogador 2 é o vencedor");
        }else if(j1 == 3 && j2 == 2 ) {
            System.out.println("Tesoura vence papel");
            System.out.println("Jogador 1 é o vencedor");
        }else{
            System.out.println("Houve um empate");
        }

        sc.close();

    }


}
