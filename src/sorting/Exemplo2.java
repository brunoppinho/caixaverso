package sorting;

import java.util.Arrays;

/*

Java usa DualPivotQuicksort para primitivos (O(n log n))"
"E TimSort para objetos (híbrido de Merge Sort + Insertion Sort)
 */
public class Exemplo2 {

    public static void main(String[] args) {
        int[] tamanhos = {1000000, 10000000, 100000000};

        for (int n : tamanhos) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = n - i; // Pior caso: ordem reversa
            }

            long inicio = System.currentTimeMillis();
            Arrays.sort(arr);
            long fim = System.currentTimeMillis();

            System.out.println(n + " elementos: " + (fim - inicio) + " ms");

            long inicio2 = System.currentTimeMillis();
            Arrays.sort(arr);
            long fim2 = System.currentTimeMillis();

            System.out.println(n + " elementos: " + (fim2 - inicio2) + " ms");
        }
    }
}
