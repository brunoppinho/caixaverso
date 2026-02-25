package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo10 {

    static class Pessoa {
        String nome;

        Pessoa(String nome) {
            this.nome = nome;
        }

        @Override
        public int hashCode() {
            int h = 0;
            for (int i = 0; i < nome.length(); i++) {
                h = 31 * h + nome.charAt(i);
            }
            return h;
        }
    }

    public static void main(String[] args) {
        Map<Pessoa, Integer> pessoas = new HashMap<>();

        Pessoa p = new Pessoa("Dante");

        pessoas.put(p, 2);
        System.out.println(pessoas.get(p));

        p.nome = "Ana";

        System.out.println(pessoas.get(p));
    }
}
