import java.util.*;

public class WriteSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if (n % 2 == 0) {
            solve(n / 2, n, false, 0);
        } else {
            solve((n + 1) / 2, n, false, 0);
        }
        System.out.println();
    }
    public static void solve(int num, int n, boolean good, int curr) {
        if (curr == n) {
            return;
        }
        if (num == 1 && n % 2 == 0) {
            curr += 2;
            System.out.print(" " + num + " " + num);
            solve(num + 1, n, true, curr);
        } else if (num == 1) {
            curr++;
            System.out.print(" " + num);
            solve(num + 1, n, true, curr);
        } else {
            if (curr == 0) {
                System.out.print(num);
            } else {
                System.out.print(" " + num);
            }
            if (good) {
                curr++;
                solve(num + 1, n, good, curr);
            } else {
                curr++;
                solve(num - 1, n, good, curr);
            }
        }
    }
}