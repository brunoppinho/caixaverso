package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo9 {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Bruno", 10);
        notas.put("Dante", 3);
        notas.put("Ana", 10);

        System.out.println(notas.get("Bruno"));
        System.out.println(notas.get("Dante"));

        System.out.println(notas.getOrDefault("Dante", 0));

        boolean contem = notas.containsKey("Dante");
        System.out.println(contem);

        boolean alguemGabaritou = notas.containsValue(10);
        System.out.println(alguemGabaritou);

        System.out.println(notas.size());

        System.out.println("Removendo o Ana" + notas.remove("Ana"));

        System.out.println(notas.size());

        notas.clear();

        System.out.println(notas.isEmpty());

        for(Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
