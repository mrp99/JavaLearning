package conditionExamples;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
        // deste item. A seguir, calcule e mostre o valor da conta a pagar.
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o código do item?");

        int codigoItem = sc.nextInt();

        System.out.println("digite a quantidade?");

        int quantidadeItem = sc.nextInt();

        double total;

        if (codigoItem == 1) {

            total = quantidadeItem * 4.00;

        } else if (codigoItem == 2) {

            total = quantidadeItem * 4.50;

        } else if (codigoItem == 3) {

            total = quantidadeItem * 5.00;

        } else if (codigoItem == 4) {

            total = quantidadeItem * 2.00;

        } else {
            total = quantidadeItem * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
