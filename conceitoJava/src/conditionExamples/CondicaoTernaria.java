package conditionExamples;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = 100.0;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
