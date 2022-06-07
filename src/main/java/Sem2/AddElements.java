import java.util.*;

public class AddElements {
    static int ans = 0;
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of integer array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter n integers separated by spaces: ");
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        System.out.println("The sum of the elements in your list: " + addElements(0));
    }
    public static int addElements(int a) {
        if (a == n) {
            return ans;
        }
        ans += arr[a];
        return addElements(a + 1);
    }
}
