package conditionExamples;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("quantas horas? ");
        hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("bom dia!!");
        } else if (hora < 18){
            System.out.println("bom tarde!!");
        } else {
            System.out.println("Boa noite!!");
        }
        sc.close();
    }
}
