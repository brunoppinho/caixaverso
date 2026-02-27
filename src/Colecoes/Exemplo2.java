package Colecoes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Exemplo2 {

    public static void main(String[] args) {
        Collection<String> nomes = new ArrayList<>();

        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());

        System.out.println(nomes.add("Bruno"));
        System.out.println(nomes.add("Bruno"));
        System.out.println(nomes.remove("Ana"));

        nomes.toArray();
    }
}
