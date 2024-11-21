package array.arryExerc.Exerc04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println ("Quantos numeros vai digitar?");
        int n = sc.nextInt ();
        int qtPares = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print ("Digite um numero: ");
            array[i] = sc.nextInt ();
        }
        System.out.println ("\nNumeros Pares:");

        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 == 0) {
                System.out.printf ("%d  ", array[i]);
                qtPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtPares);
        sc.close ();
    }
}
