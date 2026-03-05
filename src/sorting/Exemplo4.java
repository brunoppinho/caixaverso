package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo4 {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Bruno", 10));
        alunos.add(new Aluno("Ana", 9));
        alunos.add(new Aluno("Dante", 2));
        alunos.add(new Aluno("Sofia", 7));


        Collections.sort(alunos);

        System.out.println(alunos);

    }
}
