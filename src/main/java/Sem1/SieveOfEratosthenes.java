import java.util.Scanner;

public class SieveOfEratosthenes {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter integer n for nth prime (1st prime = 2): ");
        int n = scanner.nextInt();
        boolean bool[] = new boolean[1000000];
        for (int i = 0; i< bool.length; i++) {
            bool[i] = true;
         }
         for (int i = 2; i< Math.sqrt(n); i++) {
            if(bool[i] == true) {
               for(int j = (i*i); j<n; j = j+i) {
                  bool[j] = false;
               }
            }
         }
        int cnt = 0;
        int ans = 0;
        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {
                System.out.println(i);
                cnt++;
            }
            if (cnt == n) {
                ans = i;
                break;
            }
        }
        System.out.println("Prime #" + n + " is " + ans);
    }
}
