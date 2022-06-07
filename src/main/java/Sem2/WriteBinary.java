import java.util.*;

public class WriteBinary {
    static String ans = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        writeBinary(n);
        if (n < 0) {
            ans = "-" + ans;
        }
        System.out.println("Binary expression: " + ans);
    }
    public static void writeBinary(int n) {
        n = Math.abs(n);
        if (n == 1) {
            ans = "1" + ans;
            return;
        } else if (n == 0) {
            ans = "0";
            return;
        }
        ans = n % 2 + ans;
        writeBinary(n / 2);
    }
}
