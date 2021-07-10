package dia12.interfaces.formas;

public class Cilindro implements FormasGeometrica {

    private Circulo base;

    private double altura;

    public Cilindro(Circulo b, double a){
        this.base = b;
        this.altura = a;
    }


    @Override
    public String forma() {
        return "Circulo: base  = " + base.forma() + "; raio = " + altura;
    }

    @Override
    public void mostrar() {
        System.out.println(forma());
    }
}
