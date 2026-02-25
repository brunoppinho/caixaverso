package pilhasfilas;

import duplamente.ListaDupla;
import listaligada.ListaLigada;

import java.util.LinkedList;
import java.util.List;

public class FilaLigada {

    List<Integer> elementos = new LinkedList<>();

    public void enfileirar(int elemento) {
        elementos.addFirst(elemento);
    }

    public int desenfileirar() {
        return elementos.removeFirst();
    }

    public int peek() {
        return elementos.getFirst();
    }
}
