package main.java.apcs;

import java.util.Scanner;

public class test {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int ans = 0;
        int cnt = 0;
        while (cnt < 3) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter integer, try again");
            }
            int num = scanner.nextInt();
            ans += num;
            cnt++;
        }
        System.out.println("The average of the numbers is " + ans / cnt);
    }
}
