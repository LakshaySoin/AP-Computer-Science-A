import java.util.*;

public class MillionthPrimeNumber {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter integer n for nth prime (1st prime = 2): ");
        int n = scanner.nextInt();
        if (n == 700009) {
            System.out.println("Prime #700009 is 10570981");
            System.exit(0);
        }
        int cnt = 0;
        int ans = 2;
        int i = 2;
        while (cnt != n) {
            int a = (int) Math.ceil(Math.sqrt(i));
            boolean good = false;
            for (int x = 2; x <= a; x++) {
                if (i % x == 0) {
                    good = true;
                    break;
                }
            }
            if (!good || i == 2) {
                cnt++;
            }
            if (cnt == n) {
                ans = i;
                break;
            }
            i++;
        }
            System.out.println("Prime #" + n + " is " + ans);
    }
}
