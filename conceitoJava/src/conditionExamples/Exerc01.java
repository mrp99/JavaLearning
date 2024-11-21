package conditionExamples;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero qualquer?");
        int natural = sc.nextInt();
        if (natural < 0) {
            System.out.println("Negativo!");
        } else if (natural > 0){
            System.out.println("Positivo!");
        } else {
            System.out.println("Numero igual a zero");
        }
    }
}
