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
            for(i = 0; i < -sunday + 8; i++)
                System.out.print("|      ");
        }
        for(i = 1; i <= days; i++) {
            if((i + (8-sunday)) % 7 == 0){
                if(i< 10) {
                    System.out.println("|   " + i + "  |");
                }
                else{
                    System.out.println("|  " + i + "  |");
                }
            }
            else {
                if(i< 10) {
                    System.out.print("|   " + i + "  ");
                }
                else{
                    System.out.print("|  " + i + "  ");
                }
            }
        }
        if ((i-1 + (8-sunday)) % 7 == 0) {
            System.out.println("+------+------+------+------+------+------+------+");

        }
        else {
            for(i = days+1; (i + (8-sunday)) % 7 != 0; i++ ){
                System.out.print("|      ");
            }
            System.out.print("|      ");
            System.out.println("|");
            System.out.println("+------+------+------+------+------+------+------+");
        }

    }
}