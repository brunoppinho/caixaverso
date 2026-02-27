package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo4 {

    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();

        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Dante");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Dante");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Dante");
        nomes.add("Sofia");

        System.out.println(nomes);
    }
}
