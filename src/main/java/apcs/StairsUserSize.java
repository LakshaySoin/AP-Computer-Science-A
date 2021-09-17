package main.java.apcs;

import java.util.Scanner;

public class StairsUserSize {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter TOTAL_STAIRS: ");   
        int TOTAL_STAIRS = scanner.nextInt();           
        System.out.println();
        /*
        The initial stepis the TOTAL_STAIRS entered 
        and the step increases after each iteration 
        to increase the amount of spaces between each stair
        */
        int step = 5;
        createInitial(TOTAL_STAIRS, step);
        for (int i=TOTAL_STAIRS - 1; i>0; i--) {
            step += 5;
            createStairs(i, step);
        }
        // Print the last line of stars based on the TOTAL_STAIRS entered
        for (int j=0; j < (TOTAL_STAIRS * 5) + 7; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // The first method to create the initial stair since the length of the stars differs from the others
    public static void createInitial(int TOTAL_STAIRS, int step) {
        for (int i=0; i < TOTAL_STAIRS * 5 - 3; i++) {
            System.out.print(" ");
        }
        System.out.print("O  ");
        for (int x=0; x<7; x++) {
            System.out.print("*");
        }
        
        System.out.println();
        for (int i=0; i < TOTAL_STAIRS * 5 - 4; i++) {
            System.out.print(" ");
        }
        System.out.print("/|\\ *");
        for (int x=0; x<step; x++) {
            System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();
        for (int i=0; i < TOTAL_STAIRS * 5 - 4; i++) {
            System.out.print(" ");
        }
        System.out.print("/ \\ *");
        for (int x=0; x<step; x++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
    // Method to create the remaining stairs
    public static void createStairs(int TOTAL_STAIRS, int step) {
        for (int i=0; i < TOTAL_STAIRS * 5 - 3; i++) {
            System.out.print(" ");
        }
        System.out.print("O  ");
        for (int x=0; x<6; x++) {
            System.out.print("*");
        }
        for (int t = 0; t<step - 5; t++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i=0; i < TOTAL_STAIRS * 5 - 4; i++) {
            System.out.print(" ");
        }
        System.out.print("/|\\ *");
        for (int x=0; x<step; x++) {
            System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();
        for (int i=0; i < TOTAL_STAIRS * 5 - 4; i++) {
            System.out.print(" ");
        }
        System.out.print("/ \\ *");
        for (int x=0; x<step; x++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
}