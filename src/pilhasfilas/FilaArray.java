package pilhasfilas;

public class FilaArray {

    private int[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enfileirar(int elemento) {
        if (tamanho == capacidade) {
            throw new RuntimeException("Fila cheia!");
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }
}
