package main.java.apcs;

public class MultipleNumbers {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int y=9; y>=0; y--) {
                for (int x=0; x<5; x++) {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
}
