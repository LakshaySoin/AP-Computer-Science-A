import java.util.*;

public class MersennePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lo = 0;
        int hi = 1000000000; // 10e9
        boolean good = false;
        while (lo < hi) {
            int mid = lo + ((hi - lo) / 2);
            if (((Math.pow(mid, 2)) - 1) == n) {
                good = true;
                break;
            } else if ((Math.pow(mid, 2) - 1) < n) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        System.out.println(good);
    }
}
