package bitwazeExample;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma numero exempo 89 ou 113: ");
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!!");
        } else {
            System.out.println("6th bit is false!!");
        }
    }
}
