package dia8.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Fabiana", 1965, 1.90, "999899999");
        agenda.armazenaPessoa("Mariana", 1996, 1.65, "999899999");
        agenda.armazenaPessoa("Ana", 1975, 1.50, "999899999");

        boolean continuar = true;

        System.out.println("Olá, bem vindo a sua AGENDA");

        while (continuar) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Apagar um contato");
            System.out.println("3 - Procurar um contato por nome");
            System.out.println("4 - Ver todos os contato");
            System.out.println("5 - Sair");

            validaSystemInteiro(sc);

            Integer escolha = sc.nextInt();

            switch (escolha) {
                case 1:


                    System.out.println("\nDigite o nome: ");
                    String nome = sc.next();

                    System.out.println("Digite o ano de nascimento: ");
                    validaSystemInteiro(sc);
                    Integer ano = sc.nextInt();

                    System.out.println("Digite o altura: ");
                    validaSystemDouble(sc);
                    Double altura = sc.nextDouble();

                    System.out.println("Digite o número de celular: ");
                    String numeroDeCelular = sc.next();

                    agenda.armazenaPessoa(nome.trim(), ano, altura, numeroDeCelular);

                    break;

                case 2:
                    System.out.println("\nDigite o nome do contato que deseja apagar: ");
                    nome = sc.next();

                    System.out.println("\nDigite o número de celular do contato que deseja apagar: ");
                    numeroDeCelular = sc.next();

                    agenda.removePessoa(nome.trim(), numeroDeCelular.trim());
                    break;

                case 3:
                    System.out.println("\nDigite o nome do contato que deseja buscar: ");
                    nome = sc.next();
                    agenda.listaBuscaDePessoasPeloNome(nome);
                    break;

                case 4:
                    System.out.println("\n");
                    agenda.imprimeAgenda();
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");

            }

        }

        System.out.println("Até a próxima!");

        sc.close();
    }

    public static void validaSystemInteiro(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Você precisa digitar uma número inteiro");
            sc.next();
            System.out.println("Digite novamente:");
        }
    }

    public static void validaSystemDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Você precisa digitar uma número");
            sc.next();
            System.out.println("Digite novamente:");
        }
    }
}

