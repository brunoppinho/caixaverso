package sorting;

import java.util.List;

public class Exemplo1 {

    static int comparacoes = 0;
    static int trocas = 0;

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        // Simular ordenação ingênua
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                comparacoes++;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}
