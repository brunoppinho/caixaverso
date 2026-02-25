package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo11 {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Bruno", null);

        System.out.println(notas.get("Bruno"));
        System.out.println(notas.get("Dante"));

    }
}
