package DateTimeDuration.FormatDinamic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main (String[] args) {
        Date date = new Date ();
        DateFormat dF = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        DateFormat hF = new SimpleDateFormat ("HH:mm:ss");
        String dateBR = dF.format(date);
        String hourBR = hF.format(date);
        System.out.println ("data dinamica em Pt-br == " + dateBR);
        System.out.println ("hora dinamica em Pt-br == " + hourBR);
    }
}
