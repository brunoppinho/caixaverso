package sets;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movimentacao {

    Long valor;
    String descricao;
    String tipo;


    public Movimentacao(Long valor, String descricao, String tipo) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        return this.valor.equals(((Movimentacao) obj).valor) && this.descricao.equals(((Movimentacao) obj).descricao) && this.tipo.equals(((Movimentacao) obj).tipo);
    }

    @Override
    public int hashCode() {
        return this.valor.hashCode();
    }
}
