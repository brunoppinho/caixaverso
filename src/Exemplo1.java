public class Exemplo1 {

    public static void main(String[] args) {
        String[] nomes = new String[1];
        nomes[0] = "Joao";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";
        nomes[3] = "Bruno";
        nomes[4] = "Dante";
        nomes[5] = "Sofia";
        nomes[6] = "Ana";
        nomes[7] = "Claudia";
        nomes[8] = "Paula";
        nomes[9] = "Denize";

        // O que fazer para aumentar o array para 11 elementos?
        String[] outraLista = new String[nomes.length + 1];
        for (int i = 0; i < nomes.length; i++) {
            outraLista[i] = nomes[i];
        }
        nomes = outraLista;
        System.out.println(nomes[0]);
    }
}
