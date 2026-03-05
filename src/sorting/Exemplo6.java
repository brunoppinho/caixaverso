package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exemplo6 {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Bruno", 10));
        alunos.add(new Aluno("Ana", 9));
        alunos.add(new Aluno("Dante", 2));
        alunos.add(new Aluno("Sofia", 7));

        alunos.sort(Comparator.naturalOrder());
        System.out.println(alunos);

        alunos.sort(Comparator.reverseOrder());
        System.out.println(alunos);

        alunos.sort(Comparator.comparing(Aluno::getNome));
        System.out.println(alunos);

        alunos.sort(Comparator.comparing(Aluno::getNome).reversed());
        System.out.println(alunos);

        alunos.sort(Comparator.comparing(Aluno::getNome)
                .thenComparing(Aluno::getNota));
        System.out.println(alunos);

    }
}
