package mapas;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo6 {

    public static void main(String[] args) {
        Map<String, Integer> notas = new TreeMap<>();

        notas.put("Bruno", 10);
        notas.put("Ana", 9);
        notas.put("Claudia", 8);
        notas.put("Dante", 7);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
