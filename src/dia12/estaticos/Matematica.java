package dia12.estaticos;

public class Matematica {

    Integer ah;
    Integer bh;

    public void somaDeAhMaisBh(){
        System.out.println(this.ah + this.bh);
    }

    public static void somaDeAhMaisBh(int a, int b){
        System.out.println(a + b);
    }
}
