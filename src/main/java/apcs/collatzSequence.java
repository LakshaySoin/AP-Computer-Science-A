package main.java.apcs;

import java.util.Scanner;

public class collatzSequence {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of terms followed by terms: ");
        int cnt = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < cnt; i++) {
            int n = 1;
            int temp = scanner.nextInt();
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp /= 2;
                } else {
                    temp = 3 * temp + 1;
                }
                n++;
            }
            ans = Math.max(ans, n);
            System.out.println(n);
        }
        System.out.println("Longest: " + ans);
    }
}
