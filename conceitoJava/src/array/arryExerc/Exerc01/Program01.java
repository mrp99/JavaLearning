package array.arryExerc.Exerc01;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println ("Quantos números irá digitar? ");
        int n = sc.nextInt ();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print ("Digite um número: ");
            array[i] = sc.nextInt ();
        }

        System.out.println ("NUMERO NEGATIVOS:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.printf ("%d\n", array[i]);
            }
        }

        sc.close();
    }
}
