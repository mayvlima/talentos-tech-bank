package dia8.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Fabiana", 1965, 195f);
        agenda.armazenaPessoa("Mariana", 1996, 165f);
        agenda.armazenaPessoa("Ana", 1975, 165f);

        boolean continuar = true;

        System.out.println("Olá, bem vindo a sua AGENDA");

        do {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Apagar um contato");
            System.out.println("3 - Procurar um contato por nome");
            System.out.println("4 - Procurar um contato por ID");
            System.out.println("5 - Ver todos os contato");

            validaSystemInteiro(sc);

            Integer escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    if (agenda.contatos.size() < 10) {
                        sc.nextLine();
                        System.out.println("\nDigite o nome: ");
                        String nome = sc.next();

                        System.out.println("Digite o ano de nascimento: ");
                        validaSystemInteiro(sc);
                        int ano = sc.nextInt();

                        System.out.println("Digite o altura: ");
                        validaSystemFloat(sc);
                        float altura = sc.nextFloat();

                        agenda.armazenaPessoa(nome.trim(), ano, altura);

                    } else {
                        System.out.println("Agenda Lotada! Apague pelo menos um contato!");
                    }

                    break;

                case 2:
                    System.out.println("\nDigite o nome do contato que deseja apagar: ");
                    String nome = sc.next();
                    agenda.removePessoa(nome);
                    break;

                case 3:
                    System.out.println("\nDigite o nome do contato que deseja buscar: ");
                    nome = sc.next();
                    int retorno = agenda.buscaPessoa(nome);
                    if (retorno != -1) {
                        agenda.imprimePessoa(retorno);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\nDigite o ID do contato que deseja buscar: ");
                    validaSystemInteiro(sc);
                    int id = sc.nextInt();
                    agenda.imprimePessoa(id);
                    break;

                case 5:
                    System.out.println("\n");
                    agenda.imprimeAgenda();
                    break;

                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");

            }

            System.out.println("\nDeseja retornar ao menu? (1)SIM (2)NÃO");
            validaSystemInteiro(sc);
            if (sc.nextInt() == 2) {
                continuar = false;
            }
        } while (continuar == true);

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

    public static void validaSystemFloat(Scanner sc) {
        while (!sc.hasNextFloat()) {
            System.out.println("Você precisa digitar uma string");
            sc.next();
            System.out.println("Digite novamente a opção desejada:");
        }
    }
}

