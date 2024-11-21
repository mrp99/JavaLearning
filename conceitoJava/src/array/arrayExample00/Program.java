package array.arrayExample00;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println ("Digite o valor  do número n?");
        int n = sc.nextInt ();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println ("digite o valor a ser somado?");
            array[i] = sc.nextDouble ();
            System.out.println ("Posição " + i +  ", valor do array == "+ array[i]);
            System.out.println ();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println ();
            sum += array[i];
            System.out.println ("Posicao: " + i + ", valor da soma: " + sum);
        }

        double avg = sum / n;
        System.out.printf ("Average height: %.2f%n", avg);

        sc.close ();
    }
}
