package dia7;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4};

        Integer i = 0; //int
        Short s = 0; //short
        Long l = 0L; //long
        Float f = 0f; //float
        Double d = 0.0; //double
        Character c = 'a'; //char
        String str = ""; //string

        List<Double> lista = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));

        lista.addAll(Arrays.asList(4.0));

        System.out.println(lista);

        lista.add(5.0);
        lista.add(2.0);

        System.out.println(lista);

        List<Integer> list2 = new ArrayList<>(); //Arrays.stream(vetor).boxed().collect(Collectors.toList());

        for (int v : vetor) {
            list2.add(v);
        }

        System.out.println("\nLista convertida de int para Integer");
        System.out.println(list2);


        int a = 1;
        Integer b = a;

        Integer cc = 1;
        int dd = cc;

        List<Double> notas = new ArrayList<>(Arrays.asList(5.0, 8.0, 7.0));

        System.out.println("ForEach");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("For i");
        for (int j = 0; j < notas.size(); j++) {
            System.out.println(notas.get(j));
        }

        System.out.println("For do lambda");
        notas.stream().forEach(nota -> System.out.println(nota));

        System.out.println("For do lambda");
        notas.forEach(System.out::println);

        System.out.println("Imutável");
        List<Integer> testeImutavel = Arrays.asList(1,2,3);
        testeImutavel = Collections.unmodifiableList(testeImutavel);

        System.out.println(testeImutavel.get(0));

        //testeImutavel.remove(0);
    }
}
