package listaligada;

public class Main {

    public static void main(String[] args) {
        ListaLigada nomes = new ListaLigada();
        nomes.adicionarNoInicio("Bruno");
        nomes.adicionarNoInicio("Ana");
        nomes.adicionarNoFinal("Dante");
        nomes.exibir();

        System.out.println("Contem Pedro ? " + nomes.contem("Pedro"));
        System.out.println("Contem Ana ? " + nomes.contem(new String("Ana")));

        nomes.remover("Dante");
        nomes.remover("Ana");
        nomes.remover("Bruno");

        nomes.exibir();
    }
}
