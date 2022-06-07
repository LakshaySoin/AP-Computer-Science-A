import java.util.*;

public class RemoveDuplicates {
    static ArrayList<String> strings = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.");
        System.out.println();
        while (true) {
            String element = scanner.next();
            if (element.equals("lastString")) {
                break;
            }
            strings.add(element);
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
        System.out.println();
        System.out.print("Your list with duplicates removed: [");
        if (strings.size() == 0) {
            System.out.println("]");
        } else {
            removeDuplicates();
        }
        System.out.println();
    }
    public static void removeDuplicates() {
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            boolean good = true;
            for (int j = 0; j < ans.size(); j++) {
                if (ans.get(j).equalsIgnoreCase(strings.get(i))) {
                    good = false;
                }
            }
            if (good) {
                ans.add(strings.get(i));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.println(ans.get(i) + "]");
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
    }
}