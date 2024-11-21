package forExample;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {
    public static void main (String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso
        //de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
        //ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
        //o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        for (int i = 0; i < n; i++) {
            double first = sc.nextDouble ();
            double second = sc.nextDouble ();
            double third = sc.nextDouble ();
            double media = ( (first * 2.0) + (second * 3.0) + (third * 5.0) / 10.0);
            System.out.printf ("%.1f%n", media);
        }
        sc.close ();
    }
}
