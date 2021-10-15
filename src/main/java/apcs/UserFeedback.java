package main.java.apcs;

import java.util.Scanner;

public class UserFeedback {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("number of trials: ");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println("finished trial number: ");
        int temp = num / 10;
        for (int i = temp; i <= num; i += temp) {
            System.out.println("                       " + i);
        }
    }
}
