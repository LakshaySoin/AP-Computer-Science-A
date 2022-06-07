import java.util.*;

public class MaxSum {
    static int tot = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            nums[i] = a;
        }
        scanner.close();
        int limit = scanner.nextInt();
        solve(n, limit, nums, 0, 0);
        System.out.println(tot);
    }
    public static void solve(int n, int limit, int[] nums, int ans, int step) {
        tot = Math.max(tot, ans);
        for (int i = step; i < n; i++) {
            if (ans + nums[i] <= limit) {
                solve(n, limit, nums, ans + nums[i], i + 1);
            }
        }
    }
}
