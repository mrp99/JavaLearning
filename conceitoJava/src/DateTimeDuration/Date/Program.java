package DateTimeDuration.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main (String[] args) throws ParseException {
        //SimpleDateFormat
        SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse ("26/09/2023");
        Date y2 = sdf2.parse ("26/09/2023 12:30:00");

        System.out.println ("y1 == " + sdf1.format (y1));
        System.out.println ("y2 == " + sdf2.format (y2));

        Date date = new Date ();
        Date date02 = new Date (System.currentTimeMillis ());
        Date date03 = new Date (0L);
        Date date04 = new Date (1000L*60L*60L*5L);

        System.out.println ("dateAtual == " + sdf2.format (date));
        System.out.println ("dateAtual02 == " + sdf2.format (date02));
        System.out.println ("dateAtual03 == " + sdf2.format (date03));
        System.out.println ("dateAtual04 == " + sdf2.format (date04));

        System.out.println ("Padrão Iso8601 e instant class, z é padrão UTC");
        Date y01 = Date.from (Instant.parse ("2023-09-26T15:42:07Z"));
        System.out.println ("y01 == " + sdf2.format (y01));
        System.out.println ("----------------------------------------------------");
        SimpleDateFormat sdf3 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone (TimeZone.getTimeZone ("GMT"));
        System.out.println ("y1 == " + sdf3.format (y1));
        System.out.println ("y2 == " + sdf3.format (y2));
        System.out.println ("dateAtual == " + sdf3.format (date));
        System.out.println ("dateAtual02 == " + sdf3.format (date02));
        System.out.println ("dateAtual03 == " + sdf3.format (date03));
        System.out.println ("dateAtual04 == " + sdf3.format (date04));
    }
}
