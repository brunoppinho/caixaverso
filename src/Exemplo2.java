public class Exemplo2 {

    public static void main(String[] args) {
        String[] nomes = new String[11];
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

        // Como insiro o seu nome no meio dessa lista Mantendo os demais?
        for(int i = nomes.length-1; i > (nomes.length / 2); i--) {
            nomes[i] = nomes[i-1];
        }

        nomes[nomes.length/2] = "Danilon";

        System.out.println(nomes[5]);
        System.out.println(nomes[9]);
        System.out.println(nomes[6]);

    }


}
