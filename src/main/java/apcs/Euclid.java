package main.java.apcs;

import java.util.Scanner;

public class Euclid {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter positive integer a: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter positive integer b: ");
        System.out.println("Greatest common divisor (GCD) = " + findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}