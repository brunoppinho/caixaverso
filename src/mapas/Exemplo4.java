package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo4 {

    public static void main(String[] args) {
        String texto = """
                java é legal, java é poderoso java é usado em todo lugar programar em java é divertido""";
        System.out.println(texto);

        String[] palavas = texto.split(" ");
        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : palavas) {
            if (contador.containsKey(palavra)) {
                contador.put(palavra, contador.get(palavra) + 1);
            } else {
                contador.put(palavra, 1);
            }
        }

        System.out.println("Contagem de palavras");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String maisFrequente = null;
        for (String key : contador.keySet()) {
            if(maisFrequente==null){
                maisFrequente = key;
            }
            if(contador.get(key) > contador.get(maisFrequente)){
                maisFrequente = key;
            }
        }
        System.out.println(maisFrequente);
    }


}
