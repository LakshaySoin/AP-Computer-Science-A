import java.util.*;

public class Mice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int j = scanner.nextInt();
        int ans = 0;
        for (int x = 0; x < j; x++) {
            int m = scanner.nextInt();
            int[] order = new int[m];
            for (int i = 0; i < m; i++) {
                order[i] = scanner.nextInt();
            }
            if (check(nums, order)) {
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int[] nums, int[] order) {
        int[] indices = new int[order.length];
        for (int i = 0; i < order.length; i++) {
            for (int x = 0; x < nums.length; x++) {
                if (order[i] == nums[x]) {
                    indices[i] = x;
                    break;
                }
            }
        }
        for (int i = 0; i < indices.length - 1; i++) {
            if (indices[i] > indices[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
