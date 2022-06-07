import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.");
        System.out.println();
        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String a = scanner.next();
            if (a.equals("lastString")) {
                break;
            }
            strings.add(a.toLowerCase());
        }
        Collections.sort(strings);
        int tot = 1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).equals(strings.get(i - 1))) {
                tot++;
            } else {
                ans.add(tot);
                tot = 1;
            }
            if (i == strings.size() - 1) {
                ans.add(tot);
            }
        }    
        System.out.println();
        System.out.print("Your original list: [");
        for (int i = 0; i < strings.size(); i++) {
            if (i == strings.size() - 1) {
                System.out.print(strings.get(i));
            } else {
                System.out.print(strings.get(i) + ", ");
            }
        }
        System.out.println("]");
        Collections.sort(ans);
        System.out.print("Count: [");
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.print(ans.get(i));
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
