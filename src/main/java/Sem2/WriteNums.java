import java.util.*;

public class WriteNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        writeNums(n, 1);
    }
    public static void writeNums(int n, int curr) {
        if (curr == n) {
            System.out.println(curr);
            return;
        }
        System.out.print(curr + ", ");
        writeNums(n, curr + 1);
    }
}
