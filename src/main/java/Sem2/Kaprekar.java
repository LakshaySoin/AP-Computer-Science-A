import java.util.*;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first 4-digit number: ");
        int start = scanner.nextInt();
        System.out.print("Enter second 4-digit number (>= first): ");
        int end = scanner.nextInt();
        int[] ans = new int[7];
        for (int i = start; i <= end; i++) {
            if (!check(i) || i == 6174) {
                continue;
            }
            int cnt = 0;
            int num = i;
            while (num != 6174) {
                String temp = String.valueOf(num);
                char[] ascending = new char[4];
                char[] descending = new char[4];
                for (int x = 0; x < 4; x++) {
                    if (x >= temp.length()) {
                        ascending[x] = '0';
                    } else {
                        ascending[x] = temp.charAt(x);
                    }
                }
                Arrays.sort(ascending);
                for (int x = 3; x > -1; x--) {
                    descending[x] = ascending[3 - x];
                }
                String val1 = "";
                String val2 = "";
                for (int x = 0; x < 4; x++) {
                    val1 += ascending[x];
                    val2 += descending[x];
                }
                int num1 = Integer.parseInt(val1);
                int num2 = Integer.parseInt(val2);
                num = Math.abs(num2 - num1);
                cnt++;
            }
            ans[cnt - 1]++;
        }
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("Numbers that take " + (i + 1) + " iteration:  ");
            } else {
                System.out.print("Numbers that take " + (i + 1) + " iterations: ");
            }
            System.out.println(ans[i]);
        }
    }

    public static boolean check(int n) {
        String num = String.valueOf(n);
        int[] visited = new int[10];
        for (int i = 0; i < num.length(); i++) {
            visited[num.charAt(i) - 48]++;
        }
        for (int i = 0; i < 10; i++) {
            if (visited[i] == 4) {
                return false;
            }
        }
        return true;
    }
}
