package mapas;

public class Exemplo3 {

    public static void main(String[] args) {
        String texto = "ABC";

        int h = 0;
        for (int i = 0; i < texto.length(); i++) {
            h = 31 * h + texto.charAt(i);
        }
        System.out.println(h);
    }


}

/*
PASSO 1: Calcular hash da chave
chave = "123.456.789-00"
hash = hashCode("123.456.789-00") = 1547893214

PASSO 2: Calcular índice do array interno
tamanho_array = 16
índice = hash % tamanho_array
índice = 1547893214 % 16 = 14

PASSO 3: Armazenar no array interno
array[14] = par(chave="123.456.789-00", valor=Cliente)

         Array interno do HashMap
  ┌───┬───┬───┬───┬───┬───┬───┬───┐
  │   │   │   │   │   │   │   │   │ ...
  └───┴───┴───┴───┴───┴───┴───┴───┘
   0   1   2   3   4   5   6   7  ... 14
                                     ↑
                        (chave, valor) armazenado aqui

BUSCA:
1. Calcula hash da chave novamente
2. Calcula índice (hash % tamanho)
3. Vai direto na posição!

O(1)
 */

/*

Tabela de complexidade:

Operação	Melhor caso	Caso médio	Pior caso
put     	O(1)	    O(1)	    O(n)*
get        	O(1)	    O(1)	    O(n)*
remove	    O(1)	    O(1)	    O(n)*
 */