package dia3;

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

        validadaSystemIn(sc);

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

        validadaSystemIn(sc);
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");

        validadaSystemIn(sc);
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

        System.out.println("\nForma que o professor fez:");
        if (n1 == n2) {
            System.out.println("Os número são iguais");
        } else {
            System.out.println(n1 > n2 ? "O primeiro número é maior" : "O segundo número é maior");
        }

        sc.close();
    }

    public static void exercicio3Alternativo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");

        validadaSystemIn(sc);
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");

        validadaSystemIn(sc);
        int n2 = sc.nextInt();

        System.out.println("\nForma que o professor fez:");
        if (n1 == n2) {
            System.out.println("Os número são iguais");
        } else {
            System.out.println(
                    n1 > n2
                            ? String.format("O primeiro número %d é maior que %d", n1, n2)
                            : String.format("O primeiro número %d é maior que %d", n2, n1)
            );
        }
    }

    public static void exercicio4() {
        //    Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //    Encontre o maior valor
        //    Encontre o menor valor
        //    Calcule a média dos números lidos

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int numeroMaior = 0;
        int numeroMenor = 0;
        int somatoria = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %d° número inteiro: ", (i + 1));
            validadaSystemIn(sc);
            numero = sc.nextInt();

            if(i == 1){
                numeroMaior = numero;
                numeroMenor = numero;
            }

            if (numero > numeroMaior) {
                numeroMaior = numero;
            } else if (numero < numeroMenor) {
                numeroMenor = numero;
            }
            somatoria += numero;
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

        validadaSystemIn(sc);
        int escolha = sc.nextInt();

        System.out.print("\nDigite o primeiro número: ");
        validadaSystemInDouble(sc);
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        validadaSystemInDouble(sc);
        double n2 = sc.nextDouble();

        switch (escolha) {
            case 1:
                double soma = n1 + n2;
                System.out.println("\n" + n1 + " + " + n2 + " = " + soma);
                break;
            case 2:
                double subtacao = n1 - n2;
                System.out.println("\n" + n1 + " - " + n2 + " = " + subtacao);
                break;
            case 3:
                double multiplicacao = n1 * n2;
                System.out.println("\n" + n1 + " * " + n2 + " = " + multiplicacao);
                break;
            case 4:
                if (n2 != 0) {
                    double divisao = n1 / n2;
                    System.out.println("\n" + n1 + " / " + n2 + " = " + divisao);
                } else {
                    System.out.println("\nNão é possível dividir por zero");
                }
                break;
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

        validadaSystemIn(sc);
        int j1 = sc.nextInt();
        if(j1 != 1 || j1 != 2 || j1 != 3){
            System.out.println("Escolha uma opção válida!");
            System.exit(1);
        }

        System.out.println("Jogador 2 digite: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        validadaSystemIn(sc);
        int j2 = sc.nextInt();
        if(j2 != 1 || j2 != 2 || j2 != 3){
            System.out.println("Escolha uma opção válida!");
            System.exit(1);
        }

        if (j1 == j2) {
            System.out.println("Deu empate!");
        }else if (j1 == 1 && j2 == 2 || j1 == 2 && j2 == 3 ||j1 == 3 && j2 == 1) {
            System.out.println("Jogador 2 é o vencedor");
        }else{
            System.out.println("Jogador 1 é o vencedor");
        }

        sc.close();

    }

    public static void exercicio6Alternativa() {
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

        validadaSystemIn(sc);
        int j1 = sc.nextInt();

        System.out.println("Jogador 2 digite: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        validadaSystemIn(sc);
        int j2 = sc.nextInt();

        if (j1 == 1 && j2 == 2) {
            System.out.println("Papel vence pedra");
            System.out.println("Jogador 2 é o vencedor");
        } else if (j1 == 1 && j2 == 3) {
            System.out.println("Pedra vence tesoura");
            System.out.println("Jogador 1 é o vencedor");
        } else if (j1 == 2 && j2 == 1) {
            System.out.println("Papel vence pedra");
            System.out.println("Jogador 1 é o vencedor");
        } else if (j1 == 2 && j2 == 3) {
            System.out.println("Tesoura vence papel");
            System.out.println("Jogador 2 é o vencedor");
        } else if (j1 == 3 && j2 == 1) {
            System.out.println("Pedra vence tesoura");
            System.out.println("Jogador 2 é o vencedor");
        } else if (j1 == 3 && j2 == 2) {
            System.out.println("Tesoura vence papel");
            System.out.println("Jogador 1 é o vencedor");
        } else {
            System.out.println("Houve um empate");
        }

        sc.close();

    }


    public static void validadaSystemIn(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
    }

    public static void validadaSystemInDouble(Scanner sc) {
        if (!sc.hasNextDouble()) {
            System.out.println("Você precisa informar um número");
            sc.close();
            System.exit(1);
        }
    }


}
