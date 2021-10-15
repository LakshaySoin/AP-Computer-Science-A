package main.java.apcs;

public class BellsTriangle {
    public static void main(String[] args) {
        int[] previous = new int[1];
        previous[0] = 1;
        for (int i = 0; i < 8; i++) {
            int[] curr = new int[previous.length + 1];
            for (int x = 0; x < previous.length + 1; x++) {
                if (x == 0) {
                    curr[x] = previous[previous.length -1];
                    System.out.print(curr[x] + " ");
                } else {
                    curr[x] = curr[x - 1] + previous[x - 1];
                    System.out.print(curr[x] + " ");
                }
            }
            previous = new int[curr.length];
            for (int y = 0; y < curr.length; y++) {
                previous[y] = curr[y];
            }
            System.out.println();
        }
    }
}
