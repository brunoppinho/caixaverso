package listaligada;

public class ListaLigada {

    private No inicio;

    ListaLigada() {
        inicio = null;
    }

    public void adicionarNoInicio(String valor) {
        No novoNo = new No(valor);
        novoNo.proximoElemento = inicio;
        inicio = novoNo;
    }

    public void adicionarNoFinal(String valor) {
        No fim = new No(valor);
        No atual = inicio;

        if (inicio == null) {
            inicio = fim;
            return;
        }

        while (atual.proximoElemento != null) {
            atual = atual.proximoElemento;
        }
        atual.proximoElemento = fim;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximoElemento;
        }
        System.out.println("null");
    }

    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximoElemento;
        }
        return false;
    }

    public boolean remover(String valor) {
        if (inicio == null) {
            return false;
        }

        if (inicio.valor.equals(valor)) {
            inicio = inicio.proximoElemento;
            return true;
        }

        No atual = inicio;
        while (atual.proximoElemento != null) {
            if (atual.proximoElemento.valor.equals(valor)) {
                atual.proximoElemento = atual.proximoElemento.proximoElemento;
                return true;
            }
            atual = atual.proximoElemento;
        }

        return false;
    }
}
