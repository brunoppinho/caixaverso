package mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo5 {

    private static Map<Integer, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Fibonacci(10):");

        long inicio1 = System.nanoTime();
        long resultado = fibonacci(13);
        long fim1 = System.nanoTime();

        long tempo1 = fim1 - inicio1;

        System.out.println("Resultado: " + resultado);
        System.out.println("Tempo primeira execução: " + tempo1 + " ns");

        System.out.println("\nFibonacci(10) novamente:");

        long inicio2 = System.nanoTime();
        resultado = fibonacci(15); // Muito mais rápido!
        long fim2 = System.nanoTime();

        long tempo2 = fim2 - inicio2;

        System.out.println("Resultado: " + resultado);
        System.out.println("Tempo segunda execução: " + tempo2 + " ns");
    }

    public static long fibonacci(int n) {
        // Verifica cache primeiro
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Casos base
        if (n <= 1) {
            cache.put(n, (long) n);
            return n;
        }

        // Calcula recursivamente
        long resultado = fibonacci(n - 1) + fibonacci(n - 2);

        // Armazena no cache
        cache.put(n, resultado);

        return resultado;
    }

//    private static long fibonacci(int i) {
//        long fib = 0;
//        while (i > 0) {
//            fib = fib + i--;
//        }
//        return fib;
//    }


}
