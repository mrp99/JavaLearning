package DateTimeDuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main (String[] args) {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern ("dd/MM/yyyy HH:mm");
        LocalDate dFtm01 = LocalDate.parse ("25/09/2023", fmt01);
        LocalDateTime dFtm02 = LocalDateTime.parse ("25/09/2023 01:30", fmt02);

        LocalDate d03 = LocalDate.of (2023, 9, 25);
        LocalDateTime d04 = LocalDateTime.of (2023, 9, 25, 12, 30);

        System.out.println ("dfmto1 == " + dFtm01);
        System.out.println ("dfmto2 == " + dFtm02);
        System.out.println ("d03 == " + d03.toString());
        System.out.println ("d04 == " + d04.toString());

    }
}
