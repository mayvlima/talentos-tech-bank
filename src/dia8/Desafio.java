package dia8;

public class Desafio {

    public static void desafio() {
        //Dado um array de números inteiros com valores negativos e positivos,
        //encontro o número mais próximo de zero. Se houver valores como 2 e -2, considere o número positivo.

        int[] numeros = {-1, -2, 3, 4, -5, 8};

        int distanciaMenor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (Math.abs(numeros[i]) == Math.abs(distanciaMenor) && numeros[i] > distanciaMenor) {
                distanciaMenor = numeros[i];
            } else {
                if (Math.abs(numeros[i]) < Math.abs(distanciaMenor)) {
                    distanciaMenor = numeros[i];
                }
            }

        }

        System.out.println(distanciaMenor);
    }

    public static void main(String[] args) {
        desafio();
    }
}
