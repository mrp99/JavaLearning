package array.arryExerc.Exerc02;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println ("Quantos números irá digitar? ");
        int n = sc.nextInt ();
        double soma, media;

        double[] arrayDouble = new double[n];
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print ("digite um número: ");
            arrayDouble[i] = sc.nextDouble ();
        }

        soma = 0.0;
        for (int i = 0; i < arrayDouble.length ; i++) {
            soma += arrayDouble[i];
        }

        media = soma / arrayDouble.length;
        System.out.print("VALORES = ");

        for (int i = 0; i < arrayDouble.length ; i++) {
            System.out.printf("%.1f, ", arrayDouble[i]);
        }
        System.out.printf("\nSOMA = %.1f\n", soma);
        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
