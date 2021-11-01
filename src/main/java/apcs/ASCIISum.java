import java.util.Scanner;

public class ASCIISum {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            for (int x = 0; x < word.length(); x++) {
                sum += (char) word.charAt(x);
            }
        }
        System.out.println(sum);
    }
}
