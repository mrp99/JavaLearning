package array.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        String test01 = "Conhecendo mais listas";
        String test02 = "Modelando a listas";
        String test03 = "Trabalhando com listas";

        ArrayList<String> testesLista = new ArrayList<>();
        testesLista.add(test01);
        testesLista.add(test02);
        testesLista.add(test03);
//        testesLista.remove(0);
        int i = 0;
        for (String itemLista: testesLista) {
            System.out.println(itemLista + " - " + i);
            i++;
        }
        System.out.print("----------------------------------------------\n");
        String testIndex01 = testesLista.get(0);
        System.out.println("Primeiro teste: "+ testIndex01);
        String testIndex02 = testesLista.get(1);
        System.out.println("Segundo teste: "+ testIndex02);
        String testIndex03 = testesLista.get(2);
        System.out.println("Terceiro teste: "+ testIndex03);
        System.out.print("----------------------------------------------\n");
        //outra forma de fazer o for
        for (int index = 0; index < testesLista.size(); index++) {
            System.out.println("Resposa do teste: "+ testesLista.get(index) );
        }
        System.out.print("----------------------------------------------\n");
        //nao usar forEach!!!
        testesLista.forEach(item -> {
            System.out.println("Percorrendo for Each:");
            System.out.println("Teste " + item);
        });
        System.out.print("----------------------------------------------\n");

        Collections.sort(testesLista);
        System.out.println("Depois de Ordenado: ");
        System.out.println(testesLista);
        System.out.print("----------------------------------------------\n");
    }
}
