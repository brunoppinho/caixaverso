package sets;

import java.util.*;

public class Exemplo5 {

    public static void main(String[] args) {
        Collection<String> nomes = new ArrayDeque<>();

        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Dante");
        nomes.add("Sofia");

        Collection<String> criancas = new HashSet<>();
        criancas.add("Sofia");
        criancas.add("Dante");
        criancas.add("Gurilo");
//  União
//        nomes.addAll(criancas);

        nomes.removeAll(criancas);


        System.out.println(nomes);

    }
}
