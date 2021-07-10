package dia12.sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista {

    private List<Integer> meusNumeros = new ArrayList<>();

    public void add(Integer i){
        this.meusNumeros.add(i);
    }

    public void add(String str){
        this.meusNumeros.add(Integer.valueOf(str));
    }

    public void add(Double i){
        this.meusNumeros.add(i.intValue());
    }

    public void add(Float f){
        this.meusNumeros.add(f.intValue());
    }

    @Override
    public String toString() {
        return "MinhaLista{" +
                "meusNumeros=" + meusNumeros +
                '}';
    }
}
