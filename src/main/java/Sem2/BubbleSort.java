import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("bubbleSort");
        int cnt = 0;
        while (cnt < 10) {
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < 9; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            cnt++;
        }
        System.out.println();
    }
}
