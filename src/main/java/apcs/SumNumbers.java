package main.java.apcs;

import java.util.Scanner;

public class SumNumbers {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("low? ");
        int low = scanner.nextInt();
        System.out.print("high? ");
        int high = scanner.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
