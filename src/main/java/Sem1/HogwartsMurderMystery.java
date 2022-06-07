import java.io.*;
import java.util.*;

public class HogwartsMurderMystery {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in); // scanner for console to get file name
        int length = console.nextInt();
        int width;
        if (length%2 == 0) {
            width = length/4;
        }
        else {
            width = length/4+1;
        }
        int[][] numArray = new int[width][4];
        int[] sumArray = new int[width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < 4; j++) {
                numArray[i][j] = console.nextInt();
            }
            if (i%2 == 1) {
                int[] tempArray = Arrays.copyOf(numArray[i], 4);
                numArray[i][1] = numArray[i-1][1];
                numArray[i][2] = numArray[i-1][2];
                numArray[i-1][1] = tempArray[1];
                numArray[i-1][2] = tempArray[2];
                sumArray[i-1] = numArray[i-1][0] + numArray[i-1][1] + numArray[i-1][2] + numArray[i-1][3];
                sumArray[i] = numArray[i][0] + numArray[i][1] + numArray[i][2] + numArray[i][3];
            }
            if (i == width-1) {
                sumArray[i] = numArray[i][0] + numArray[i][1] + numArray[i][2] + numArray[i][3];
            }
        }

        for(int x: sumArray) {
            System.out.print((char) x);
        }
        System.out.println();
    }
}