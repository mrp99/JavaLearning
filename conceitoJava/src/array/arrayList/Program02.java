package array.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program02 {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add ("Maria");
        list.add ("Alex");
        list.add ("Anna");
        list.add ("Mariana");
        list.add(2, "Marco");

        System.out.println (list.size ());

        for (String x: list) {
            System.out.println (x);
        }

        System.out.println ("\n----------------------");

        list.removeIf (x -> x.charAt (0) == 'M');//predicado

        for (String x: list) {
            System.out.println (x);
        }

        System.out.println ("\n----------------------");

        System.out.println ("------------------------");
        System.out.println ("Index of Maria"+ list.indexOf ("Maria"));
        System.out.println ("Index of Mariana"+ list.indexOf ("Mariana"));
        System.out.println ("------------------------");
        List<String> result = list.stream ().filter (x -> x.charAt (0) == 'A')
                .collect(Collectors.toList());

        for (String x: result) {
            System.out.println (result);
        }

        //encontrar um elemento da lista com certo predicado:
        System.out.println ("------------------------");
        String name = list.stream ().filter (x -> x.charAt (0) == 'A').findFirst ().orElse (null);
        System.out.println (name);
    }
}
