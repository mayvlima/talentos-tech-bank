package dia7;

public class CanetaBic extends Caneta {

    String tampaTraseira;

    CanetaBic() {
        this.tubo = "transparente";
        this.quantidadeDeTinta = 1.0;
        this.anoPatente = 2000;
    }

    @Override
    public String toString() {
        return "CanetaBic{" +
                "tampaTraseira='" + tampaTraseira + '\'' +
                '}' + "\n" + super.toString();
    }


}
