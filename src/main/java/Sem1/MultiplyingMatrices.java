import java.util.*;

public class MultiplyingMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int[][] matrix1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int x = 0; x < m1; x++) {
                int a = scanner.nextInt();
                matrix1[i][x] = a;
            }
        }
        int n2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int[][] matrix2 = new int[n2][m2];
        if (n1 != m2 || m1 != n2) {
            System.out.println("Incompatible matrices!");
        } else {
            for (int i = 0; i < n2; i++) {
                for (int x = 0; x < m2; x++) {
                    int a = scanner.nextInt();
                    matrix2[i][x] = a;
                }
            }
            for (int x = 0; x < n1; x++) {
                for (int j = 0; j < m2; j++) {
                    int temp = 0;
                    for (int i = 0; i < m1; i++) {
                        temp += (matrix1[x][i] * matrix2[i][j]);
                    }
                    System.out.printf("%4s", temp);
                }
                System.out.println();
            }
        }
    }
}
