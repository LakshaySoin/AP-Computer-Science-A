import java.util.*;

public class CountSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        int ans = 0;
        int temp = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != temp) {
                ans++;
                temp = arr[i];
            }
        }
        System.out.println(ans);
    }
}
