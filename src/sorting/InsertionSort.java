package sorting;

import java.util.Arrays;

/*

Array: [5, 2, 8, 1, 9]

INÍCIO:
[5 | 2, 8, 1, 9]
 ↑ ordenado

PASSO 1: Inserir 2
[5 | 2, 8, 1, 9]
2 < 5 → insere antes
[2, 5 | 8, 1, 9]
    ↑ ordenado

PASSO 2: Inserir 8
[2, 5 | 8, 1, 9]
8 > 5 → fica no lugar
[2, 5, 8 | 1, 9]
       ↑ ordenado

PASSO 3: Inserir 1
[2, 5, 8 | 1, 9]
1 < todos → insere no início
[1, 2, 5, 8 | 9]
          ↑ ordenado

PASSO 4: Inserir 9
[1, 2, 5, 8 | 9]
9 > todos → fica no lugar
[1, 2, 5, 8, 9]
             ↑ ordenado
✓ Completo!

 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Antes: " + Arrays.toString(numeros));

        insertionSort(numeros);

        System.out.println("Depois: " + Arrays.toString(numeros));
    }

    public static void insertionSort(int[] numeros) {
        int tamanho = numeros.length;
        for (int i = 1; i < tamanho; i++) {
            int chave = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;
        }

    }
}
