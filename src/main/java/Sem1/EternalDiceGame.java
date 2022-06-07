import java.util.*;

public class EternalDiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int cnt = 0;
        while (true) {
            int n = random.nextInt(6) + 1;
            System.out.println(n);
            cnt++;
            if (n == 6) {
                break;
            }
        }
        if (cnt % 3 == 1) {
            System.out.println("Bob rolled the first 6 after " + cnt + " total rolls");
        } else if (cnt % 3 == 2) {
            System.out.println("Cob rolled the first 6 after " + cnt + " total rolls");
        } else {
            System.out.println("Bob rolled the first 6 after " + cnt + " total rolls");
        }
    }
}
