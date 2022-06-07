import java.util.Scanner;

public class LargestFactorLogN {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scanner.nextInt();
        int right = num - 1;
        int ans = 0;
        for (int i = 1; i <= right; i++) {
            if (num % right == 0) {
                ans = Math.max(ans, right);
            } 
            if (num % i == 0) {
                ans = Math.max(ans, i);
            }
            right--;
        }
        System.out.println(ans);
    }
}
