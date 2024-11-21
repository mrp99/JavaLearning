package array.forEach;

import java.util.ArrayList;

public class Program {
    public static void main (String[] args) {
        String[] array1 = new String[]{"1, ", "2, ", "3"};

        for (String item: array1) {
            System.out.print (item);
        }

        System.out.println ("\n===========================");

        Double a = 10.0;
        Double b = 12.0;

        ArrayList<Double> array2 = new ArrayList<>();
        array2.add(a);
        array2.add(b);

        array2.forEach(item -> {
            System.out.print(item + ", ");
        });
    }
}
