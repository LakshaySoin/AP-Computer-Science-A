import java.util.Scanner;

public class EFibonacci {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of terms: ");
        int length = scanner.nextInt();
        long[] array = new long[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
            if (i == 0 || i == 1) {
                System.out.println(array[i]);
            } else {
                array[i] = array[i - 1] + array[i - 2];
                System.out.println(array[i - 1] + array[i - 2]);
            }

        }
    }
}
