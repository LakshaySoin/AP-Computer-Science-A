import java.util.*;
import java.io.*;

public class MagicSquare {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new File("test.txt"));
        for (int i = 1; i < 1000; i++) {
            pw.println(Math.pow(i, 2));
        }
    }

    public static boolean isMagicSquare(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                sum += arr[i][x];
            }
        }
        sum /= arr.length;
        int d1 = 0;
        int d2 = 0;
        int cnt1 = 0;
        int cnt2 = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int row = 0;
            int col = 0;
            for (int x = 0; x < arr[i].length; x++) {
                if (i == x) {
                    d1 += arr[i][x];
                }
                if (i == cnt1 && x == cnt2) {
                    d2 += arr[i][x];
                }
                row += arr[i][x];
                col += arr[x][i];
            }
            if (row != sum || col != sum) {
                return false;
            }
            cnt1++;
            cnt2--;
        }
        if (d1 != sum || d2 != sum) {
            return false;
        }
        return true;
    }
}
