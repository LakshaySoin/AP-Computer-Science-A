package main.java.apcs;

import java.util.Scanner;

public class PizzaSlice {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("radius = ");
        int radius = scanner.nextInt();
        int temp = 0;
        for (int i=0; i < radius; i++) {
            System.out.print(" ");
        }
        System.out.println("A");
        for (int i=1; i <= radius - 1; i++) {
            for (int x=radius; x > i; x--) {
                System.out.print(" ");
            }
            System.out.print((char) (65 + i*2));
            for (int j=0; j<i * 2 - 1; j++) {
                System.out.print(".");
            }
            System.out.print((char) (65 + i*2));
            temp = (char) 65 + i*2;
            System.out.println();
        }
        for (int k=0; k < radius * 2 + 1; k++) {
            System.out.print((char) (temp + 2));
        }
        System.out.println();
    } 
}
