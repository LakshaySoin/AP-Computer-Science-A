package main.java.apcs;

import java.util.Scanner;

public class getKthDigit {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String n = scanner.next();
        int k = scanner.nextInt();
        if (n.length() <= k ){
            System.out.println(0);
        } else {
            System.out.println(n.charAt(n.length() - (k + 1))); 
        }
    }
}
