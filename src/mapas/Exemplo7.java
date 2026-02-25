package mapas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo7 {

    public static void main(String[] args) {
        Map<String, Integer> notas = new LinkedHashMap<>();

        notas.put("Bruno", 10);
        notas.put("Ana", 9);
        notas.put("Claudia", 8);
        notas.put("Dante", 7);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
