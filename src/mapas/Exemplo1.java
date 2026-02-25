package mapas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {

    static class Cliente {
        String cpf;
        String nome;
        double saldo;

        Cliente(String cpf, String nome, double saldo) {
            this.cpf = cpf;
            this.nome = nome;
            this.saldo = saldo;
        }
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            clientes.add(new Cliente(
                    String.format("%011d", i),
                    "Cliente " + i,
                    1000.0 + i
            ));
        }

        String cpf = "00000099999";

        long inicio = System.nanoTime();

        Cliente encontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.cpf.equals(cpf)) {
                encontrado = cliente;
                break;
            }
        }

        long fim = System.nanoTime();
        long tempoNano = fim - inicio;

        System.out.println("Cliente: " + encontrado.nome);
        System.out.println("Tempo: " + tempoNano + " nanosegundos");
        System.out.println("Tempo: " + (tempoNano / 1_000_000.0) + " milissegundos");
    }

}
