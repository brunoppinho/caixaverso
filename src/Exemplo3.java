import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exemplo3 {

    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();

        Instant begin = Instant.now();
        for (int i = 0; i < 100000; i++) {
            nomes.add("Ana");
        }

        Instant end = Instant.now();
        System.out.println(nomes.size());

        System.out.println(end.getNano() - begin.getNano());

        begin = Instant.now();
        for (int i = 0; i < nomes.size(); i++) {
            nomes.set(i, "No");
        }
        end = Instant.now();
        System.out.println(end.getNano() - begin.getNano());

    }
}
