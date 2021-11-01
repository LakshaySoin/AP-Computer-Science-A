import java.util.Scanner;

public class FunctionCalculator {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Please enter your first  number: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Please enter your second number: ");
        System.out.println("sum        = " + (num1 + num2));
        System.out.println("difference = " + (num1 - num2));
        System.out.println("product    = " + (num1 * num2));
        System.out.println("quotient   = " + (num1 / num2));
        System.out.println();
    }
}
