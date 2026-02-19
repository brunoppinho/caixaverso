import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exemplo4 {

    public static void main(String[] args) {
        System.out.println("Lista Ligada");
        calcula(new LinkedList<>());

        System.out.println("Array List");
        calcula(new ArrayList<>());
    }

    private static void calcula(List<Integer> numeros) {
        Instant begin = Instant.now();
        Random random = new Random();

        // 1º FOR: preencher a lista
        for (int i = 0; i < 10_0000; i++) {
            numeros.addFirst(random.nextInt(100));
        }

        // 2º FOR: calcular a soma
        long soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }

        double media = soma / (double) numeros.size();
        Instant end = Instant.now();
        System.out.println(end.toEpochMilli() - begin.toEpochMilli());
        System.out.println("Média: " + media);
    }
}
