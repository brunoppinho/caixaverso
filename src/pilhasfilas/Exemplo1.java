package pilhasfilas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exemplo1 {

    public static void main(String[] args) {
//        List<String> historico = new ArrayList<>();
//
//        historico.add("google.com");
//        historico.add("github.com");
//        historico.add("twitter.com");
//        historico.add("facebook.com");
//        historico.add("youtube.com");
//
//        historico.get(2);
//        historico.remove(0);


        Stack<String> historico = new Stack<>();

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
