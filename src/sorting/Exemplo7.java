package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exemplo7 {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Bruno", 10));
        alunos.add(new Aluno("Ana", 9));
        alunos.add(new Aluno("Dante", 2));
        alunos.add(new Aluno("Sofia", 7));

        alunos.stream()
                .filter(a -> a.getNota() >= 7)
                .sorted(Comparator.comparing(Aluno::getNome).reversed())
                .limit(2)
                .map(Aluno::getNome)
                .forEach(System.out::println);
    }
}
