import java.util.Scanner;

public class SquareRootCurve {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Initial score: ");
        double noCurve = scanner.nextDouble();
        if(noCurve <= 100 && noCurve > 0) {
            findGrade(sqrt(noCurve/100)*100);
        }
        else{
            if (noCurve == 0) {
                System.out.println(0);
                System.out.print("F");
            } else {
                System.out.println("Please enter a valid score");
            }
        }
        System.out.println();
    }
    public static double sqrt(double d) {
        double num = d;
        boolean b = true;
        for(int i = 0; b == true; i++) {
            num = (num + d/num)/2.0;
            b = (Math.abs(num * num - d) > (1e-10));
            System.out.println("ITERATE: " + num);
        }
        return num;
    }
    public static void findGrade(double num) {
        System.out.printf("%.2f %n", num);
        if(num >= 90 && num <= 100) {
            System.out.print("A");
        }
        if(num >= 80 && num < 90) {
            System.out.print("B");
        }
        if(num >= 70 && num < 80) {
            System.out.print("C");
        }
        if(num >= 60 && num < 70) {
            System.out.print("D");
        }
        if(num >= 60) {
            if (num == 100 || num % 10 >= 7) {
                System.out.print("+");
            }
            else if (num % 10 <= 3) {
                System.out.print("-");
            }
        }
    }
}
