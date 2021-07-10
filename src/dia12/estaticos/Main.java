package dia12.estaticos;

public class Main {

    public static void main(String[] args) {
        System.out.println(Exemplos.pi);

        Exemplos ex = new Exemplos();

        System.out.println(ex.pi2);

        ex.pi2 = 123.0;

        System.out.println(ex.pi2);

        //Exemplos.pi = 999.0;

        System.out.println(Exemplos.pi);

        Matematica matematica = new Matematica();

        matematica.ah = 1;
        matematica.bh = 100;

        matematica.somaDeAhMaisBh();


        Matematica.somaDeAhMaisBh(1,2);
    }
}
