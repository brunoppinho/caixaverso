package mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo8 {

    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Bruno", "Diana"};

        // HashMap - sem ordem garantida
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nomes.length; i++) {
            hashMap.put(nomes[i], i);
        }

        System.out.println("HashMap: " + hashMap.keySet());
        // Ordem aleatória: pode ser [Ana, Carlos, Diana, Bruno]

        // TreeMap - ordem alfabética
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nomes.length; i++) {
            treeMap.put(nomes[i], i);
        }

        System.out.println("TreeMap: " + treeMap.keySet());
        // Sempre: [Ana, Bruno, Carlos, Diana]

        // LinkedHashMap - ordem de inserção
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < nomes.length; i++) {
            linkedMap.put(nomes[i], i);
        }

        System.out.println("LinkedHashMap: " + linkedMap.keySet());
        // Sempre: [Carlos, Ana, Bruno, Diana]
    }
}
