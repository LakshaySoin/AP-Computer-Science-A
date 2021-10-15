package main.java.apcs;

import java.util.Scanner;

public class Calender {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Please enter the number of days in the month: ");
        int days = scanner.nextInt();
        System.out.print("Please enter the number of the day of the first Sunday: ");
        int sunday = scanner.nextInt();
        System.out.println();
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
        insideCalendar(days, sunday);
        System.out.println();
    }
    public static void insideCalendar (int days, int sunday) {
        int i = 1;
        if(sunday > 1) {
            int x = 0;
            while (x < -sunday + 8) {
                System.out.print("|      ");
                x++;
            }
        }
        int n = 1;
        while (n <= days) {
            if((n + (8-sunday)) % 7 == 0){
                if(n < 10) {
                    System.out.println("|   " + n + "  |");
                }
                else{
                    System.out.println("|  " + n + "  |");
                }
            }
            else {
                if(n < 10) {
                    System.out.print("|   " + n + "  ");
                }
                else{
                    System.out.print("|  " + n + "  ");
                }
            }
            n++;
        }
        if ((i-1 + (8-sunday)) % 7 == 0) {
            System.out.println("+------+------+------+------+------+------+------+");

        }
        else {
            int x = days + 1;
            while ((x + (8-sunday)) % 7 != 0){
                System.out.print("|      ");
                x++;
            }
            System.out.print("|      ");
            System.out.println("|");
            System.out.println("+------+------+------+------+------+------+------+");
        }

    }
}