package array.arryExerc.Exerc07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        int n;
        double soma, media;
        System.out.print ("Quantos Elementos vai ter o veto?");
        n = sc.nextInt ();

        double[] array = new double[n];

        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextDouble ();
        }

        soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        media = soma / array.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < array.length; i++) {
            if ( array[i] < media) {
                System.out.printf ("%.1f\n", array[i]);
            }
        }

        sc.close ();
    }
}
