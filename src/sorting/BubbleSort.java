package sorting;

import java.util.Arrays;

/*
Array: [5, 2, 8, 1, 9]

PASSADA 1:
[5, 2, 8, 1, 9]
 ↓  ↓
[2, 5, 8, 1, 9]  (troca)
    ↓  ↓
[2, 5, 8, 1, 9]  (OK)
       ↓  ↓
[2, 5, 1, 8, 9]  (troca)
          ↓  ↓
[2, 5, 1, 8, 9]  (OK)
Maior (9) está no fim ✓

PASSADA 2:
[2, 5, 1, 8, 9]
 ↓  ↓
[2, 5, 1, 8, 9]  (OK)
    ↓  ↓
[2, 1, 5, 8, 9]  (troca)
       ↓  ↓
[2, 1, 5, 8, 9]  (OK)
Segundo maior (8) está no lugar ✓

PASSADA 3:
[2, 1, 5, 8, 9]
 ↓  ↓
[1, 2, 5, 8, 9]  (troca)
    ↓  ↓
[1, 2, 5, 8, 9]  (OK)
✓ Ordenado!
 */
public class BubbleSort {

    public static void main(String[] args) {
//        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
//        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        int[] numeros = {10, 9, 8, 7};

        System.out.println("Antes: " + Arrays.toString(numeros));

        bubbleSort(numeros);

        System.out.println("Depois: " + Arrays.toString(numeros));
    }

    public static void bubbleSort(int[] numeros) {
        int tamanho = numeros.length;
        boolean ordenado;

        for (int i = 0; i < tamanho; i++) {
            ordenado = true;
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    ordenado = false;
                }
            }
            if (ordenado) {
                break;
            }
        }
    }
}
