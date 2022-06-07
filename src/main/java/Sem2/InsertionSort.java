import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("insertionSort");
        for (int i = 1; i < 10; i++) {
            System.out.println(Arrays.toString(nums));
            int val = nums[i];
            int temp = i - 1;
            while (temp >= 0 && nums[temp] > val) {
                nums[temp + 1] = nums[temp];
                temp--;
            }
            nums[temp + 1] = val;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println();
    } 
}
