import java.util.*;

public class Parentheses {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your string below:");
        String string = scanner.next();
        int ans = 0;
        int temp = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        boolean good = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                temp++;
                cnt1++;
            } else if (string.charAt(i) == ')') {
                temp--;
                cnt2++;
            }
            if (cnt2 > cnt1) {
                good = false;
            }
            ans = Math.max(ans, temp);
        }
        System.out.println(cnt1 == cnt2 && good);
        if (cnt1 == cnt2 && good) {
            System.out.println(ans);
        }
    }
}