import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random rand = new Random();
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Enter desired sum of two dice: ");
        int sum = scanner.nextInt();
        int rolls = scanner.nextInt();
        System.out.print("Enter number of rolls: probability: ");
        System.out.printf("%.2f", solve(sum, rolls));
        System.out.println();
    }

    public static double solve(int sum, int rolls) {
        int success = 0;
        for (int i = 0; i < rolls; i++) {
            int randomNumber1 = rand.nextInt(6) + 1;
            int randomNumber2 = rand.nextInt(6) + 1;
            if (randomNumber1 + randomNumber2 == sum) {
                success++;
            }
        }
        return (double) success / rolls;
    }
}
