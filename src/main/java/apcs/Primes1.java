import java.util.Scanner;

public class Primes1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter positive integer: ");
        int n = scanner.nextInt();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        int ans1 = 2;

        int j = 1;

        while (j < prime.length) {
            if (prime[j] == true) {
                ans1 = Math.max(ans1, j);
            }
            j++;
        }

        int ans2 = 2;

        int x = 1;

        while (x < ans1) {
            if (prime[x] == true && n % x == 0) {
                ans2 = Math.max(ans2, x);
            }
            x++;
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
