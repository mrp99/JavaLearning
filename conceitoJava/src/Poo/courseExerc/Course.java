package Poo.courseExerc;

import java.util.Locale;
import java.util.Scanner;

public class Course {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        Account account;

        System.out.print ("Enter account number: ");
        int number = sc.nextInt ();

        System.out.print ("Entner account holder: ");
        sc.nextLine ();
        String holder = sc.nextLine ();

        System.out.print ("Is there an inital deposit (y/n)? ");
        char response = sc.next ().charAt (0);

        if (response == 'y') {
            System.out.print ("Enter inital deposit value: ");
            double initialDepoist = sc.nextDouble ();
            account = new Account (number, holder, initialDepoist);
        } else {
            account = new Account (number, holder);
        }
        System.out.println ();
        System.out.println ("Account data: ");
        System.out.println (account);

        System.out.println ();
        System.out.print ("Enter a deposit value: ");
        double depositValue = sc.nextDouble ();
        account.deposit (depositValue);
        System.out.println ("Update account data: ");
        System.out.println (account);

        System.out.println ();
        System.out.print ("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble ();
        account.withdraw (withdrawValue);
        System.out.println ("Update account data: ");
        System.out.println (account);
        sc.close ();
    }
}
