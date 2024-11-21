package DateTimeDuration.FormatLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main (String[] args) {
        LocalDate d01 = LocalDate.parse("2023-09-25");
        LocalDateTime d02 = LocalDateTime.parse("2023-09-25T12:54:45");
        Instant d03 = Instant.parse("2023-09-25T01:30:26Z"); //global

        LocalDate r1 = LocalDate.ofInstant (d03, ZoneId.systemDefault ());
        System.out.println ("r1 = " + r1);

    }
}
