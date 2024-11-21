package sortDesc;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String[] array = String.valueOf(num).split("");
        System.out.println ("valor do array antes ordenação == " +
                Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println ("valor do array depois ordenação == " +
                Arrays.toString(array));
        return Integer.valueOf(String.join("", array));
    }
}



