package sets;

import java.util.*;

public class RemoverDuplicados {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 2, 4, 1, 5, 3);

        System.out.println(numeros);
        List<Integer> numerosRemovidos = removerDuplicados(numeros);
        System.out.println(numerosRemovidos);

    }

    public static List<Integer> removerDuplicados(List<Integer> numeros) {
        Set<Integer> naoDuplicados = new HashSet<>(numeros);
        return new ArrayList<>(naoDuplicados);
    }
}
