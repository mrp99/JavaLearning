package array.arryExerc.Exerc05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.println ("Quantos numeros vai digitar?");
        int n, posMaior;
        n = sc.nextInt ();
        double[] array = new double[n];
        double maior = array[0];
        posMaior = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print ("Digite um numero: ");
            array[i] = sc.nextDouble ();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
                posMaior = i;
            }
        }
        System.out.printf ("MAIOR VALOR = %.1f\n", maior);
        System.out.printf ("POSICAO DO MAIOR VALOR = %d\n", posMaior);
        sc.close();
    }
}
