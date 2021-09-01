package main.java.apcs;

public class SlashFigure2 {
    public static void main(String[] args) {
        for (int i=0; i<4; i++) {
            for (int x=0; x<i; x++) {
                System.out.print("\\\\");
            }
            for (int y=0; y < -4 * i + 14; y++) {
                System.out.print("!");
            }
            for (int x=0; x<i; x++) {
                System.out.print("//");
            }
            System.out.println();
        }

        for (int i=0; i<8; i++) {
            for (int x=0; x<i; x++) {
                System.out.print("\\\\");
            }
            for (int y=0; y < -4 * i + 30; y++) {
                System.out.print("!");
            }
            for (int x=0; x<i; x++) {
                System.out.print("//");
            }
            System.out.println();
        }
    }
}