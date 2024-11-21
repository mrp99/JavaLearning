package conditionExamples;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia em numero da semana?");
        int x = sc.nextInt();
        String dia;
        String feira;

        switch (x) {
            case 1:
                dia = "Domingo".toLowerCase();
                break;

            case 2:
                dia = "Segunda".toLowerCase();
                break;

            case 3:
                dia = "Terça".toLowerCase();
                break;

            case 4:
                dia = "Quarta".toLowerCase();
                break;

            case 5:
                dia = "Quinta".toLowerCase();
                break;

            case 6:
                dia = "Sexta".toLowerCase();
                break;

            case 7:
                dia = "Sabado".toLowerCase();
                break;

            default:
                dia = "invalido";
                break;
        }
        System.out.println("Dia da Semana: " + dia);
        sc.close();
    }
}
