package pilhasfilas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
Problema:

"Verificar se uma expressão matemática tem parênteses balanceados."

Exemplos:

"(2 + 3) * (4 - 1)" → ✅ válido
"((2 + 3)" → ❌ inválido (falta fechar)
"2 + 3)" → ❌ inválido (fecha sem abrir)
 */

public class Exemplo4 {

    public static void main(String[] args) {
        Deque<String> historico = new ArrayDeque<>();

        historico.push("google.com");
        historico.push("github.com");
        historico.push("twitter.com");
        historico.push("facebook.com");
        historico.push("youtube.com");

        System.out.println("Voltando para a pagina anterior -> " + historico.pop());
        System.out.println("Voltando para a pagina anterior -> " + historico.pop());
        System.out.println("Voltando para a pagina anterior -> " + historico.pop());
        historico.peek();
    }
}
