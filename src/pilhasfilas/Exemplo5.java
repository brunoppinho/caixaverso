package pilhasfilas;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exemplo5 {

    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();

        fila.add(30);
        fila.add(29);
        fila.add(10);
        fila.add(40);

        System.out.println("Ordem de saida");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
