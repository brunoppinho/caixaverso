package pilhasfilas;

public class PilhaArray {

    private Integer[] elementos;
    private int tamanho;
    private int topo;

    public PilhaArray(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new Integer[tamanho];
        topo = -1;
    }

    public void push(Integer elemento) {
        if (topo == tamanho - 1) {
            throw new RuntimeException("Pilha cheia.");
        }
        topo++;
        elementos[topo] = elemento;
    }


    public Integer pop() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia.");
        }
        return elementos[topo--];
    }

    public Integer peek() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia.");
        }
        return elementos[topo];
    }
}
