import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("selectionSort");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(nums));
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < 10; j++) {
                if (smallest > nums[j]) {
                    smallest = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = smallest;
            nums[index] = temp;
        }
        System.out.println();
    }
}