import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int cnt = scanner.nextInt();
            map.put(word, cnt);
        }
        for (int i = 0; i < k; i++) {
            String word = scanner.next();
            int cnt = scanner.nextInt();
            int num = map.get(word);
            num += cnt;
            map.put(word, num);
        }
        int ans = 0;
        for (int i = 0; i < q; i++) {
            String word = scanner.next();
            ans += map.get(word);
        }
        System.out.println(ans);
    }
}
