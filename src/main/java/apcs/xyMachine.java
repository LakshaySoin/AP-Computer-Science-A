package main.java.apcs;

public class xyMachine {
    public static void main(String[] args) {
        double x = 1.0;

        for (int y = 2; y <= 100; y++) {
            x = x * y + y + x;
        }
        System.out.println(x);
    }
}