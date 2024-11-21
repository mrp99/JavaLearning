package array.arrayExample01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println ("Digite o numero de Interações n?");
        int num = sc.nextInt ();
        Product[] array = new Product[num];

        for(int i = 0; i < array.length; i++) {
            System.out.println ("Digite nome do produto? ");
            sc.nextLine ();
            String name = sc.nextLine ();

            System.out.println ("Digite  o valor do produto?");
            double price = sc.nextDouble ();

            array[i] = new Product (name, price);
            System.out.println (i+ ": " + array[i]);
        }

        double sum = 0.0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i].getPrice ();
            System.out.println ("Posição: " +i + " objeto =>" + array[i] + " soma => " + sum);
        }

        double avg = sum / array.length;
        System.out.printf ("Average price = %.2f%n", avg);

        sc.close ();
    }
}
