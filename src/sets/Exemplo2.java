package sets;

import java.util.HashSet;
import java.util.Set;

public class Exemplo2 {

    public static void main(String[] args) {
        Set<Movimentacao> movimentacoes = new HashSet<>();

        movimentacoes.add(new Movimentacao(10l, "Teste1", "Pix"));
        movimentacoes.add(new Movimentacao(10l, "Teste", "Pix"));

        System.out.println(movimentacoes.size());
    }
}
