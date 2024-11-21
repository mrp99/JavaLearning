package Poo.WrapperClasses;

public class Program {
    public static void main (String[] args) {
        //wrapper class aceita null para algum tipo de variaveis pode ser vantajoso.
        int x = 20;
        Integer obj = x;
        System.out.println (obj);

        int y = obj / 4;
        System.out.println (y);

        int z = Integer.parseInt("2");
        System.out.println(z);

        double d = Double.parseDouble("10");
        System.out.println(d);

        Float f = Float.valueOf("10");
        System.out.println(f);

        Integer i = new Integer(10);
        int g = i.intValue();
        System.out.println (g);

        //teste de referencia e não são testado os valores
        Integer g1 = new Integer (10);
        Integer h1= new Integer(10);
        System.out.println(g1==h1);


    }



}
