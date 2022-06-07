import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        // Arrays.sort(arr);
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == a) {
                ans = mid;
                break;
            } else if (arr[mid] < a) {
                lo = mid + 1;
            } else if (arr[mid] > a) {
                hi = mid;
            }
        }
        System.out.println(ans);
    } 
}
