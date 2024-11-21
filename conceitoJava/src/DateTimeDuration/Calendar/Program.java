package DateTimeDuration.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main (String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from (Instant.parse ("2023-09-26T15:42:07Z"));
        System.out.println (simpleDateFormat.format (date));

        Calendar cal = Calendar.getInstance ();
        cal.setTime (date);
        cal.add(Calendar.HOUR_OF_DAY,4);
        date = cal.getTime ();
        System.out.println (simpleDateFormat.format (date));


        //Obtendo uma unidade de tempo:
        int seconds = cal.get(Calendar.SECOND);
        int minutes =  cal.get (Calendar.MINUTE);
        int hours = cal.get (Calendar.HOUR);
        int months = 1 + cal.get (Calendar.MONTH);
        System.out.println ("Seconds: " + seconds);
        System.out.println ("Minutes: " + minutes);
        System.out.println ("Hours: " + hours);
        System.out.println ("Months: " + months);
    }
}
