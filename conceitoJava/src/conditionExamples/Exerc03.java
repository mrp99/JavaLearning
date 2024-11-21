package conditionExamples;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        /*
        * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
        * digitados em ordem crescente ou decrescente.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero inteiro?");
        int A = sc.nextInt();
        System.out.println("digite o segundo numero inteiro?");
        int B = sc.nextInt();
        Locale.setDefault(Locale.US);
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }
        sc.close();
    }
}
