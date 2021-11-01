import java.util.HashMap;
import java.util.Map;

public class Amicable {
    public static void main(String[] args) {
        Map<Integer, Integer> amicable = new HashMap<Integer, Integer>();
        for (int i=1; i<=100000; i++) {
            int temp = 0;
            for (int x=1; x<i; x++) {
                if (i % x == 0) {
                    temp += x;
                }
            amicable.put(i, temp);
            }
        }
        for (int k = 1; k <= amicable.size(); k++) {
            for (int i=1; i<=100000; i++) {
                if (amicable.get(k) != null && amicable.get(i) != null && k != i) {
                    if (amicable.get(k) == i && amicable.get(i) == k) {
                        System.out.println("(" + amicable.get(i) + "), (" + amicable.get(k) + ")");
                    }
                }
            }
        }
    }
}