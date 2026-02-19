package duplamente;

public class ListaDupla {

    private NoDuplo inicio;
    private NoDuplo fim;

    public void adicionarNoFinal(String valor) {
        NoDuplo novo = new NoDuplo(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            return;
        }

        fim.proximo = novo;
        novo.anterior = fim;
        fim = novo;
    }
}
