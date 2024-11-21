package Poo.ProblemExample;

import java.util.Locale;
import java.util.Scanner;

public class mainProgram {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        Product produto = new Product ();
        System.out.println ("Enter product data: ");
        System.out.print ("Name: ");
        produto.name = sc.nextLine ().toLowerCase ();
        System.out.print ("Price: ");
        produto.price = sc.nextDouble ();
        System.out.print ("Quantity: ");
        produto.quantity = sc.nextInt ();
        System.out.println ();
        System.out.println ("Product data: " + produto);

        System.out.println ();
        System.out.println ("Enter the number of products to be added in stock: ");

        int newQuantity =  sc.nextInt ();
        produto.addProducts (newQuantity);
        System.out.println ();
        System.out.println ("Updated data: " + produto);

        newQuantity =  sc.nextInt ();
        produto.removeProducts (newQuantity);
        System.out.println ();
        System.out.println ("Remove data: " + produto);
        sc.close ();
    }
}
