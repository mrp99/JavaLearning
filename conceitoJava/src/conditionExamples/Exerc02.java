package conditionExamples;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero qualquer?");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("È impar!");
        }
    }
}
