import java.util.*;
import java.io.*;

public class BennyTheBunny {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of text file: ");
        String file = sc.next();
        Scanner scanner = new Scanner(new File(file));
        int n = scanner.nextInt();
        int[][] x = new int[n][n];
        int[][] y = new int[n][n];
        int[][] c = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                x[k][j] = a;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                y[k][j] = a;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                c[k][j] = a;
            }
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int xcoor = i;
                int ycoor = k;
                int carrots = 0;
                while (xcoor >= 0 && xcoor < n && ycoor >= 0 && ycoor < n) {
                    if (visited[ycoor][xcoor]) {
                        for (boolean[] row : visited) {
                            Arrays.fill(row, false);
                        }
                        break;
                    }
                    visited[ycoor][xcoor] = true;
                    carrots += c[ycoor][xcoor];
                    int temp1 = x[ycoor][xcoor];
                    int temp2 = y[ycoor][xcoor];
                    xcoor += temp1;
                    ycoor += temp2;
                }
                m = Math.max(m, carrots);
            }
        }
        System.out.println(m);
    }
}
