import java.util.Scanner;

public class Lollipop {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int temp = (char) (65);
        System.out.print("Size = ");
        int size = scanner.nextInt();
        for (int x = 1; x < size; x++) {
            for (int i=0; i < size - ((x-1)*2); i++) {
                System.out.print(" ");
            }
            System.out.print((char) temp);
            for (int k=0; k < x*4 - 1; k++) {
                System.out.print(".");
            }
            System.out.print((char) temp);
            temp += 2;
            System.out.println(); 
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print((char) temp);
            for (int x = 0; x < size * 2 + 3; x++) {
                System.out.print(".");
            }
            System.out.print((char) temp);
            temp += 2;
            System.out.println(); 
        }
        for (int x = 1; x < size; x++) {
            for (int i=0; i < size - ((x-1)*2); i++) {
                System.out.print(" ");
            }
            System.out.print((char) temp);
            for (int k=0; k < x*4 - 1; k++) {
                System.out.print(".");
            }
            System.out.print((char) temp);
            temp += 2;
            System.out.println(); 
        }
        for (int i=0; i < size * 2; i++) {
            for (int x=0; x < size + 2; x++) {
                System.out.print(" ");
            }
            System.out.print(".");
            System.out.println();
        }
    }
}
