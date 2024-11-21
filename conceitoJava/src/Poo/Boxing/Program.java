package Poo.Boxing;

public class Program {
    public static void main (String[] args) {
        //boxing
        int x = 20;
        Object obj = x;
        System.out.println (obj);

        //unboxing
        int y = (int) obj;
        System.out.println (y);

    }
}
