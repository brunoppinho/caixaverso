package pilhasfilas;

public class Exemplo3 {

    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo: " + pilha.peek()); // 30
//        System.out.println("Tamanho: " + pilha.size()); // 3

        System.out.println("Removido: " + pilha.pop()); // 30
        System.out.println("Removido: " + pilha.pop()); // 20

        System.out.println("Topo: " + pilha.peek()); // 10
    }
}
