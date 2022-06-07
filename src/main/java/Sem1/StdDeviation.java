import java.util.*;

public class StdDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the integer array dimension: ");
        int n = scanner.nextInt();
        System.out.println("Please enter the array elements: ");
        double sum = 0;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            nums[i] = a;
            sum += a;
        }

        double mean = (sum / n);

        double updatedMean = 0;

        for (int i = 0; i < n; i++) {
            updatedMean += Math.pow(nums[i] - mean, 2);
        }

        System.out.printf("Standard deviation = %.3f",  Math.sqrt(updatedMean / (n - 1)));
        System.out.println();
    }
}
