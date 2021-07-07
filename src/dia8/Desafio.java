package dia8;

public class Desafio {

    public static void desafio() {
        //Dado um array de números inteiros com valores negativos e positivos,
        //encontro o número mais próximo de zero. Se houver valores como 2 e -2, considere o número positivo.

        int[] numeros = {-1, -2, 3, 4, -5, 1};

        int distanciaMenor = Integer.MAX_VALUE;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (Math.abs(numeros[i]) < distanciaMenor) {
                distanciaMenor = numeros[i];
                posicao = i;
            }

        }

        System.out.println(numeros[posicao]);
    }

    public static void main(String[] args) {
        desafio();
    }
}
