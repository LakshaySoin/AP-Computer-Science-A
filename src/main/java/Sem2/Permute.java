import java.util.*;

public class Permute {
    static TreeSet<String> ans = new TreeSet<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String word = scanner.next();
        permute(word, "");
        for (String i : ans) {
            System.out.println(i);
        }
    }
    public static void permute(String word, String a) {
        if (word.length() == 0) {
            ans.add(a);
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String rest = word.substring(0, i) + word.substring(i + 1);
            permute(rest, a + c);
        }
    }
}
