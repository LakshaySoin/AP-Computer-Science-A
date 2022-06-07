import java.util.Scanner;

public class HolyNumbers {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        String curr = "";
        int ans = 0;
        while (curr.length() <= n) {
            curr = String.valueOf(i);
            if (curr.length() == n) {
                int sum = 0;
                boolean good = false;
                for (int x = 0; x < curr.length(); x++) {
                    String c = String.valueOf(curr.charAt(x));
                    sum += Integer.parseInt(c);
                    if (c.equals(String.valueOf(a)) || c.equals(String.valueOf(b))) {
                        good = true;
                    } else {
                        good = false;
                        break;
                    }
                }
                if ((sum == a || sum == b) && good) {
                    ans++;
                }
            }
            i++;
        }
        System.out.println(ans % 1000000007);
    }
}
