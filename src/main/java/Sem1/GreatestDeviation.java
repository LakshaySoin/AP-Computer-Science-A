import java.util.*;

public class GreatestDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            sum += a;
            nums[i] = a;
        }

        int mean = sum / n;

        Arrays.sort(nums);

        int a = nums[n - 1] - mean;
        int b = mean - nums[0];

        int ans = 0;

        if (a > b) {
            ans = n - 1;
        } else {
            ans = 0;
        }

        System.out.println(nums[ans]);
    }
}
