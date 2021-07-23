package padaria.aplication;

import java.math.BigDecimal;
import java.util.Scanner;

public class Validador {

    public static void validaSystemInteiro(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Você precisa digitar uma número inteiro");
            sc.next();
            System.out.print("Digite novamente: ");
        }
    }

    public static String inputStringVazio(Scanner sc) {
        String s = sc.next();
        while (s.isEmpty()) {
            System.out.println("Você deve digitar um valor");
            System.out.print("Digite novamente: ");
            s = sc.next();
        }
        return s;
    }

    public static void validaSystemBigDecimal(Scanner sc) {
        while (!sc.hasNextBigDecimal()) {
            System.out.println("Você precisa digitar uma número");
            sc.next();
            System.out.print("Digite novamente: ");
        }
    }


    public static BigDecimal validaValorPositivo(Scanner sc) {

        BigDecimal numero = sc.nextBigDecimal();
        while (numero.signum() < 0) {
            System.out.println("Você deve digitar uma valor maior do que zero");
            System.out.print("Digite novamente: ");
            validaSystemBigDecimal(sc);
            numero = sc.nextBigDecimal();
        }

        return numero;
    }
}
