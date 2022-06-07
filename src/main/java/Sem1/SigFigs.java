import java.util.*;

public class SigFigs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any number, integer or decimal: ");
        String n = scanner.next();
        boolean good = false;
        boolean decimal = false;
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '0' && good && !decimal) {
                temp++;
            } else if (n.charAt(i) == '.') {
                ans += temp;
                decimal = true;
            } else if (decimal && good && n.charAt(i) == '0') {
                ans++;
            } else if (n.charAt(i) != '0') {
                ans++;
                good = true;
            }
        }
        System.out.println(ans);
    }
}
