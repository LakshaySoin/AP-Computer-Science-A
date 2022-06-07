import java.util.*;

public class WaysToClimb {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs to climb (positive integer): ");
        int n = scanner.nextInt();
        solve(n, 0, "[");
        System.out.println("Total number of ways = " + ans);
    }
    public static void solve(int n, int curr, String res) {
        if (curr == n) {
            res = res.substring(0, res.length() - 2) + "]";
            System.out.println(res);
            ans++;
            return;
        }
        if (n > curr) {
            solve(n, curr + 1, res + "1, ");
            solve(n, curr + 2, res + "2, ");
        }
    }
}
