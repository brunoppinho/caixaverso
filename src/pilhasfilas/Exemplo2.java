package pilhasfilas;

public class Exemplo2 {

    public static void main(String[] args) {
        System.out.println("Iniciando exemplo");
        metodoA();
        System.out.println("Fim do exemplo");
    }

    private static void metodoA() {
        System.out.println("Iniciando A");
        metodoB();
        System.out.println("Fim do A");
    }

    private static void metodoB() {
        System.out.println("Iniciando B");
        metodoC();
        System.out.println("Fim do B");
    }

    private static void metodoC() {
        System.out.println("Metodo C");
        metodoA();
    }
}
