package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo2 {

    public static void main(String[] args) {
        Map<String, String> nomes = new HashMap<>();
        String str1 = new String("456");
        String str2 = new String("456");

        nomes.put("123", "Bruno");
        nomes.put(str1, "Ana");
        nomes.put("789", "Claudia");
        nomes.put(str2, "Dante");

        System.out.println(nomes.get(str2));
    }
}
