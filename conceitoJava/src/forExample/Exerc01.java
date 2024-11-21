package forExample;

import java.util.Scanner;

public class Exerc01 {
    public static void main (String[] args) {
    //  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
    //  inclusive X, se for o caso.
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite um numero entre 1 e 1000 e veja o seus impares ?");
        int x = sc.nextInt ();
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println (i);
            }
        }
        sc.close ();
    }
}
