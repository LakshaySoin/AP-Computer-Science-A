package main.java.apcs;

import java.util.Scanner;

public class HarmonicSeries {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double limit = scanner.nextDouble();
        int cnt = 1;
        double divisor = 2.0;
        double sum = 1.0;
        while (sum <= limit) {
            sum += (1/divisor);
            divisor++;
            cnt++;
        }
        System.out.print("Actual sum = ");
        System.out.printf("%.5f", sum);
        System.out.println("\nNumber of terms required: " + cnt);
    }
}
