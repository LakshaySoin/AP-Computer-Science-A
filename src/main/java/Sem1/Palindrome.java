import java.util.Collections;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int i = word.length() - 1;
        int x = 0;
        boolean ans = true;
        while (x <= i) {
            if (word.charAt(x) != word.charAt(i)) {
                ans = false;
                break;
            } else {
                x++;
                i--;
            }
        }
        System.out.println(ans);
    }
}
