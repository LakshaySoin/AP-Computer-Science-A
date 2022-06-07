import java.util.*;

public class MoveDisks {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();
        System.out.print("Enter destination post: ");
        String d = scanner.next();
        char dest = d.charAt(0);
        System.out.println("Moves:");
        char container;
        if (dest == 'B') {
            container = 'C';
        } else {
            container = 'B';
        }
        moveDisks(n, 'A', dest, container);
        System.out.println("Number of moves: " + ans);
    }
    public static void moveDisks(int n, char from, char to, char container) {
        if (n == 0) {
            return;
        }
        ans++;
        moveDisks(n - 1, from, container, to);
        System.out.println(from + " -> " + to);
        moveDisks(n - 1, container, to, from);
    }
}
