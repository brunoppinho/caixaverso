package sets;

import java.util.HashSet;
import java.util.Set;

public class ValidadorCPF {

    private Set<String> cpfsCadastrados = new HashSet<>();

    public boolean cadastrar(String cpf) {
        return cpfsCadastrados.add(cpf);
    }

    public int totalCadastrados() {
        return cpfsCadastrados.size();
    }

    public boolean estaCadastrado(String cpf) {
        return cpfsCadastrados.contains(cpf);
    }

    public static void main(String[] args) {
        ValidadorCPF validador = new ValidadorCPF();

        validador.cadastrar("123.456.789-00");  // ✓
        validador.cadastrar("987.654.321-00");  // ✓
        validador.cadastrar("123.456.789-00");  // ✗ duplicado!

        System.out.println("\nTotal: " + validador.totalCadastrados()); // 2

        boolean existe = validador.estaCadastrado("123.456.789-00");
        System.out.println("CPF existe? " + existe); // true
    }

}
