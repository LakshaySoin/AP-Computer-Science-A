import java.util.*;

public class lastIndexOf {
    public static void main(String[] args) {
        System.out.println("Please enter seven elements of an integer array and a value: ");
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        int n = scanner.nextInt();
        int ans = -1;
        for (int i = 6; i > -1; i--) {
            if (arr[i] == n) {
                ans = i;
                break;
            }
        }
        System.out.println("Last index of value = " + ans);
    }    
}
