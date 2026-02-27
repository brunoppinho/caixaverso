package sets;

import java.util.Set;
import java.util.TreeSet;

public class SuperTrunfo {

    static class Carro implements Comparable<Carro> {

        int velocidadeMaxima;
        String modelo;

        Carro(int velocidadeMaxima, String modelo) {
            this.velocidadeMaxima = velocidadeMaxima;
            this.modelo = modelo;
        }

        @Override
        public int compareTo(Carro o) {
            return velocidadeMaxima - o.velocidadeMaxima;
        }

        @Override
        public String toString() {
            return modelo + " " + velocidadeMaxima;
        }
    }

    public static void main(String[] args) {
        Set<Carro> ranking = new TreeSet<>();

        ranking.add(new Carro(100, "Gol"));
        ranking.add(new Carro(90, "Corsa"));
        ranking.add(new Carro(0, "Marea"));
        ranking.add(new Carro(300, "Ferrari"));
        ranking.add(new Carro(1000, "Uno com escada"));

        System.out.println(ranking);


    }
}
