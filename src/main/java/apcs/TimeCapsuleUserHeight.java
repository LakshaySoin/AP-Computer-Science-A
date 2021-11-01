import java.util.Scanner;

public class TimeCapsuleUserHeight {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter HEIGHT: ");
        int height = scanner.nextInt();
        System.out.println();
        top(height);
        middle(height);
        bottom(height);
    }

    public static void top(int height) {
        for (int i=0; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i=height - 1; i >= 0; i--) {
            for (int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < (height * 2 - 1) - i * 2; j++) {
                System.out.print("o");
            }
            System.out.print("\\");
            System.out.println();
        }
    }

    public static void bottom(int height) {
        for (int i=0; i <= height - 1; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 0; j < (height * 2 - 1) - i * 2; j++) {
                System.out.print("o");
            }
            System.out.print("/");
            System.out.println();
        }
        for (int i=0; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void middle(int height) {
            for (int i=0; i < 1; i++) {
                System.out.print("|");
                for (int j = 0; j < (height * 2 - 1) - i * 2; j++) {
                    System.out.print("@");
                }
                System.out.print("|");
                System.out.println();
            }
            for (int i=0; i < height * 2 - 3; i++) {
                System.out.print("|");
                System.out.print("@");
                for (int j = 0; j < (height * 2 - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("@");
                System.out.print("|");
                System.out.println();
            }
            for (int i=0; i < 1; i++) {
                System.out.print("|");
                for (int j = 0; j < (height * 2 - 1) - i * 2; j++) {
                    System.out.print("@");
                }
                System.out.print("|");
                System.out.println();
            }
    }
}