import java.util.Scanner;

public class LargestFactor {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                ans = Math.max(ans, i);
            }
        }
        System.out.println(ans);
    }
}
