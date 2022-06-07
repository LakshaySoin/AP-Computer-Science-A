import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class BedfordsLaw {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Let us count those leading digits...");
        System.out.print("input file name? ");
        // String file = sc.next();
        // Scanner scanner = new Scanner(new File(file));
        Scanner scanner = new Scanner(System.in);
        int[] cnt = new int[9];
        double sum = 0;
        int zeros = 0;
        while (scanner.hasNext()) {
            String num = scanner.next();
            if (num.equals("exit")) {
                break;
            }
            if (num.charAt(0) != '0') {
                cnt[(Integer.parseInt(String.valueOf(num.charAt(0))) - 1)] += 1;
                sum++;
            } else {
                zeros++;
            }
        }
        if (zeros > 0) {
            System.out.println("excluding " + zeros + " zeros");
        }
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Digit Count Percent");
        for (int i = 0; i < 9; i++) {
            System.out.print("    " + (i + 1));
            int spaces = 6 - String.valueOf(cnt[i]).length();
            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }
            System.out.print(cnt[i]);
            double temp = cnt[i] / sum;
            System.out.printf("%7.2f", temp * 100);
            System.out.println();
        }
        System.out.println("Total    " + (int) sum + " 100.00");
    }
}
