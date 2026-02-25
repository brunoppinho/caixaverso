package pilhasfilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidadorParenteses {


    public static void main(String[] args) {
        String[] testes = {
                "(2 + 3) * (4 - 1)",   // válido
                "((2 + 3)",            // inválido
                "2 + 3)",              // inválido
                "(()())",              // válido
                "(((",                 // inválido
                "))(("                 // inválido
        };

        for (String teste : testes) {
            System.out.println(teste + " → " + validar(teste));
        }
    }

    public static boolean validar(String expressao) {
        Deque<Character> pilha = new ArrayDeque<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }
}
