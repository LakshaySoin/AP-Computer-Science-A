package main.java.apcs;

import java.util.Scanner;

public class PascalsTriangle {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] previous = new int[1];
        previous[0] = 1;
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            for (int x = (2 * len) - (i * 2) - 2; x > 0; x--) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print(1);
            } else if (i == 1) {
                System.out.print(1 + "   " + 1);
                previous = new int[2];
                previous[0] = 1;
                previous[1] = 1;
            } else {
                int[] curr = new int[i + 1];
                curr[0] = 1;
                curr[curr.length - 1] = 1;
                for (int y = 1; y < curr.length - 1; y++) {
                    curr[y] = previous[y - 1] + previous[y];
                }
                previous = new int[curr.length];
                for (int l = 0; l < curr.length; l++) {
                    previous[l] = curr[l];
                    if (l != curr.length - 1) {
                        String temp = String.valueOf(curr[l + 1]);
                        System.out.print(curr[l]);
                        for (int b = 4 - temp.length(); b > 0; b--) {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(curr[curr.length - 1]);
                    }
                }
            }
            System.out.println();
        }
    }
}
