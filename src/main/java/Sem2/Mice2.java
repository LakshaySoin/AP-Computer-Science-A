import java.util.*;

public class Mice2 {
    static int[][] grid;
    static boolean[][] visited;
    static int x, y;
    static String ans = "NO";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns, then enter map.");
        x = scanner.nextInt();
        y = scanner.nextInt();
        grid = new int[x][y];
        visited = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            String line = scanner.next();
            for (int j = 0; j < y; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        floodfill(0, 0);
        System.out.println(ans);
    }
    public static void floodfill(int currx, int curry) {
        if (currx < 0 || curry < 0 || currx > x - 1 || curry > y - 1 || visited[currx][curry] || grid[currx][curry] == '+') {
            return;
        } else if (grid[currx][curry] == 'M') {
            ans = "YES";
        }
        visited[currx][curry] = true;
        if (curry + 1 < y) {
            floodfill(currx, curry + 1);
        }
        if (currx + 1 < x) {
        floodfill(currx + 1, curry);
        }
        if (curry - 1 > -1) {
        floodfill(currx, curry - 1);
        }
        if (currx - 1 > 0) {
        floodfill(currx - 1, curry);
        }
    }
}
