package dia7;

import java.util.*;

public class Exercicios {

    public static void validadaSystemIn(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            sc.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        // Ler somente 5 números.

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            validadaSystemIn(sc);

            lista.add(sc.nextInt());
        }

        System.out.println("\nOs números digitados foram: ");
        System.out.println(lista);

        sc.close();
    }

    public static void exercicio1ComArray() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        // Ler somente 5 números.

        Scanner sc = new Scanner(System.in);

        int[] lista = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            validadaSystemIn(sc);

            lista[i] = sc.nextInt();
        }

        System.out.println("\nOs números digitados foram: ");
        System.out.println(Arrays.toString(lista));

        sc.close();
    }

    public static void exercicio2() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

        Scanner sc = new Scanner(System.in);
        int negativos = 0;

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista.add(sc.nextInt());

            if (lista.get(i) < 0) {
                negativos++;
            }
        }

        System.out.printf("\nA quantidade de números negativos é igual a = %d", negativos);

        System.out.println(lista.stream().filter(numero -> numero < 0).count());

        sc.close();
    }

    public static void exercicio2ComArray() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

        Scanner sc = new Scanner(System.in);
        int negativos = 0;

        int[] lista = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista[i] = sc.nextInt();

            if (lista[i] < 0) {
                negativos++;
            }
        }

        System.out.printf("\nA quantidade de números negativos é igual a = %d", negativos);

        sc.close();
    }

    public static void exercicio3() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

        Scanner sc = new Scanner(System.in);
        int pares = 0;

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista.add(sc.nextInt());

            if (lista.get(i) % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("\nA quantidade de números pares é igual a = %d", pares);

        System.out.println(lista.stream().filter(numero -> numero % 2 == 0).count());


        sc.close();
    }

    public static void exercicio3ComArray() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

        Scanner sc = new Scanner(System.in);
        int pares = 0;

        int[] lista = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista[i] = sc.nextInt();

            if (lista[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("\nA quantidade de números negativos é igual a = %d", pares);

        sc.close();
    }

    public static void exercicio4() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista.add(sc.nextInt());
        }

        int maior = lista.get(0);

        for (Integer numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("\nO maior número é = %d", maior);
        System.out.println(Collections.max(lista));
        System.out.println(lista.stream().max(Integer::compare).get());
        System.out.println(lista.stream().mapToInt(v -> v).max().getAsInt());

        sc.close();
    }

    public static void exercicio4ComArray() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor

        Scanner sc = new Scanner(System.in);

        int[] lista = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);

            validadaSystemIn(sc);

            lista[i] = sc.nextInt();
        }

        int maior = lista[0];

        for (Integer numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("\nO maior número é = %d", maior);

        sc.close();
    }

    public static void exercicio5() {
        //Escreva um algoritmo que simula um jogo da forca simples.
        // o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
        // caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
        // o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

        Scanner sc = new Scanner(System.in);

        String[] palavra = {"C", "E", "L", "U", "L", "A", "R"};

        String[] descoberto = {" _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ "};

        List<String> letrasEscolhidas = new ArrayList<>();

        int totalAcertos = 0;
        int tentativas = 10;

        System.out.println("Bem vindo ao JOGO DA FORCA!");

        while (tentativas > 0) {
            System.out.println("\nDigite uma letra: ");
            String letra = sc.next().toUpperCase().trim();

            int acertos = 0;
            letrasEscolhidas.add(letra);

            for (int i = 0; i < palavra.length; i++) {
                if (letra.equals(palavra[i])) {
                    descoberto[i] = letra;
                    acertos++;
                    totalAcertos++;
                }
            }

            System.out.println("");
            for (String l : descoberto) {
                System.out.print(l + " ");
            }

            if (totalAcertos == 7) {
                System.out.println("\nParabéns! Você acertou a palavra!");
                break;
            }

            if (acertos > 0) {
                System.out.printf("\nVocê teve %d acerto(s)!\n", acertos);
            } else {
                System.out.printf("\nA letra %s não faz parte da palavra!", letra);
                tentativas--;
            }

            System.out.printf("\nVocê ainda tem %d tentativa(s)!", tentativas);

            System.out.println("\nLetras que já foram escolhidas: ");
            System.out.println(letrasEscolhidas);
            System.out.println("\n*********************************");
        }

        sc.close();

    }

    public static void exercicio5ResolucaoProfessor() {
        // Escreva um algoritmo que simula um jogo da forca simples.
        // o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
        // caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
        // o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.


        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, dê uma dica sobre a palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();


        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>(Collections.nCopies(palavraParaSerAdivinhada.length, false));

        System.out.println("Agora é a vez do jogador 2...");
        System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2, chute uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true);
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes--;
                System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
            }

            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (listaDeLetrasAcertadas.get(i)) {
                    System.out.printf("%s ", palavraParaSerAdivinhada[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();


        }


        System.out.println("------------------------------");
        if (!listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("Jogador 1 ganhou o jogo");
        }


        in.close();
    }

    public static void main(String[] args) {
        exercicio5ResolucaoProfessor();
    }


}
