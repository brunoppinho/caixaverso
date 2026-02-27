package sets;

import java.util.HashSet;
import java.util.Set;

public class Exemplo3 {

    public static void main(String[] args) {
        /*
        A = {1, 2, 3}
        B = {2, 3, 4}
         */

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(5);
        numeros.add(5);

        numeros.add(4);
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.contains(3);
        System.out.println(numeros);

    }
}
