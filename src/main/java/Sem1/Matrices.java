import java.util.Scanner;

public class Matrices {
    public static void main(String[] args)
    {
        int i, j, k, sum=0, row1, col1, row2, col2;
        Scanner scan = new Scanner(System.in);

        row1 = scan.nextInt();
        col1 = scan.nextInt();
        int[][] M1 = new int[row1][col1];
        for(i=0; !(i >= row1); ++i)
        {
            for(j=0; j<col1; j++)
                M1[i][j] = scan.nextInt();
        }
        row2 = scan.nextInt();
        if (row2 == col1) {
            col2 = scan.nextInt();
            int[][] M2 = new int[row2][col2];
            for (i = 0; i < row2; i++) {
                for (j = 0; j < col2; j++)
                    M2[i][j] = scan.nextInt();
            }

            int[][] M3 = new int[row1][col2];

            // multiplying the two matrices
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    sum = 0;
                    for (k = 0; k < col1; k++)
                        sum = sum + (M1[i][k] * M2[k][j]);
                    M3[i][j] = sum;
                }
            }

            for (i = 0; row1 > i; i++) {
                for (j = 0; col2 > j; j++)
                    System.out.printf("%4s", M3[i][j]);
                System.out.println();
            }
        } else {
            System.out.println("Incompatible matrices!");
        }
    }
}