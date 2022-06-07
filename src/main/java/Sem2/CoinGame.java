import java.util.*;

public class CoinGame {
    static int ans = 0;
    static String winner = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1's name: ");
        String first = scanner.next();
        System.out.print("Enter player 2's name: ");
        String second = scanner.next();
        System.out.print("Enter how many coins this game starts with: ");
        int n = scanner.nextInt();
        System.out.println();
        System.out.println("There are " + ans + " possible perfect games.");
        System.out.println("The winner is: " + winner);
    }
    public static void solve(int n, int cnt) {
        
    }
}
