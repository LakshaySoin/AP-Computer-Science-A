import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            nums[i] = a;
            temp[i] = a;
        }
        int pointer = n - 1;
        for (int i = 0; i < n; i++) {
            nums[i] = temp[pointer];
            pointer--;
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");
    }
}
