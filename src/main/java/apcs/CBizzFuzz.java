package main.java.apcs;

import java.util.Scanner;

public class CBizzFuzz {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        int x = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i < x; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && i % 15 != 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
