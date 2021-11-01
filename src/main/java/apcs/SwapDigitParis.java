import java.util.*;

public class SwapDigitParis {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        System.out.println("swapped result = " + swapDigitPairs(num));
    }

    public static int swapDigitPairs(int n) {
        String num = String.valueOf(n);
        char[] arr = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }
        for (int i = 0; i < num.length() - 1; i += 2) {
            if (num.length() % 2 == 1 && i == 0) {
                i -= 1;
            } else {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        String ans = "";
        for (int i = 0; i < num.length(); i++) {
            ans += arr[i];
        }
        return Integer.valueOf(ans);
    }

}
