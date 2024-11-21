package conditionExamples;

import java.util.Locale;
import java.util.Scanner;

public class OptinalSintaxe {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de minutos que foram consumidos??");
        int minutes = sc.nextInt();
        double conta = 50.0;

        if (minutes > 100) {
            //-= é operacção acumulativa
            conta += (minutes- 100) * 2.00;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);



        sc.close();
    }
}
