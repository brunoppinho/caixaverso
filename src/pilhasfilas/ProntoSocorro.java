package pilhasfilas;

import java.util.PriorityQueue;
import java.util.Queue;

class Paciente implements Comparable<Paciente> {
    String nome;
    int gravidade; // 1=crítico, 5=leve

    Paciente(String nome, int gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    @Override
    public int compareTo(Paciente outro) {
        // Menor gravidade = maior prioridade
        return this.gravidade - outro.gravidade;
    }

    @Override
    public String toString() {
        String nivel = gravidade == 1 ? "CRÍTICO" :
                gravidade == 2 ? "URGENTE" :
                        gravidade == 3 ? "MODERADO" : "LEVE";
        return nome + " [" + nivel + "]";
    }
}

public class ProntoSocorro {
    public static void main(String[] args) {
        Queue<Paciente> fila = new PriorityQueue<>();

        // Chegada dos pacientes (ordem aleatória)
        fila.offer(new Paciente("João", 3));    // Moderado
        fila.offer(new Paciente("Maria", 1));   // Crítico
        fila.offer(new Paciente("Pedro", 5));   // Leve
        fila.offer(new Paciente("Ana", 2));     // Urgente
        fila.offer(new Paciente("Carlos", 1));  // Crítico

        System.out.println("=== ORDEM DE ATENDIMENTO ===");
        while (!fila.isEmpty()) {
            Paciente p = fila.poll();
            System.out.println("Atendendo: " + p);
        }

        // Saída:
        // Maria [CRÍTICO]
        // Carlos [CRÍTICO]
        // Ana [URGENTE]
        // João [MODERADO]
        // Pedro [LEVE]
    }
}
