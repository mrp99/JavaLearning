package array.arryExerc.Exerc08;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        int n, somapares = 0, npares = 0;
        double mediapares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] array = new int[n];

        for (int i=0; i < array.length; i++) {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            if (array[i] % 2 == 0) {
                somapares = somapares + array[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            mediapares = (double)somapares / npares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }

        sc.close();
    }

}
