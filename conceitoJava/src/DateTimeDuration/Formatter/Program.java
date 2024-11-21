package DateTimeDuration.Formatter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main (String[] args) {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        DateTimeFormatter fmt02 =  DateTimeFormatter.ofPattern ("dd/MM/yyyy HH:mm").withZone (ZoneId.systemDefault ());
        DateTimeFormatter fmt03 =  DateTimeFormatter.ISO_DATE_TIME; //data local

        LocalDate d01 = LocalDate.parse ("2023-09-25");
        LocalDateTime dLDT01 = LocalDateTime.parse ("2023-09-25T12:48:55");
        Instant d02 = Instant.parse("2023-09-25T12:36:05Z");//global
        System.out.println ("d01 com format = " + d01.format (fmt01));
        System.out.println ("d01 com format invertido = " + fmt01.format (d01));
        System.out.println ("Formato br == "+ fmt02.format (d02));
        System.out.println ("dLDT01 em formato Iso == " + dLDT01.format (fmt03) );



    }
}
