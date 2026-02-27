package sets;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.*;

public class Exemplo1 {
    static Set<String> emails = new HashSet<>();

    public static void main(String[] args) {
        Instant begin = Instant.now();

        for (int i = 0; i < 10_000; i++) {
            if (i % 2 == 0) {
                adicionar("bruno" + (double) i + "@gmail.com");
            } else {
                adicionar("bruno" + (i + 1.0) + "@gmail.com");
            }
        }

        System.out.println(Instant.now().toEpochMilli() - begin.toEpochMilli());

        System.out.println(emails.size());

    }

    static void adicionar(String email) {
        emails.add(email);
    }
}
