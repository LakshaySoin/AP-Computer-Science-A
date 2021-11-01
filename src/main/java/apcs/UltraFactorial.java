import java.util.Scanner;

public class UltraFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        System.out.println(superFactorial(n));
        System.out.println(ultraFactorial(n));
        scanner.close();
    }

    public static long factorial(int n) {
        long sum = n;
        for (int i = n - 1; i > 1; i--) {
            sum *= i;
        }
        return sum;
    }

    public static long superFactorial(int n) {
        long sum = factorial(n);
        for (int i = n - 1; i > 1; i--) {
            sum *= factorial(i);
        }
        return sum;
    }

    public static long ultraFactorial(int n) {
        long sum = superFactorial(n);
        for (int i = n - 1; i > 1; i--) {
            sum *= superFactorial(i);
        }
        return sum;
    }
}
