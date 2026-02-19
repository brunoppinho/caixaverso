package duplamente;

public class NoDuplo {

    String valor;
    NoDuplo proximo;
    NoDuplo anterior;

    NoDuplo(String valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}
