package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplo3 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(5, 2, 8, 1, 9)
        );

        Collections.sort(numeros);

        System.out.println(numeros);

        List<String> nomes = new ArrayList<>(
                Arrays.asList("Sofia", "Ana", "Dante", "Bruno")
        );
        Collections.sort(nomes);

        System.out.println(nomes);
    }
}
