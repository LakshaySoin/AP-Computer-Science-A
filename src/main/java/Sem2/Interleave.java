import java.util.*;

public class Interleave {
    static ArrayList<Integer> list1 = new ArrayList<Integer>();
    static ArrayList<Integer> list2 = new ArrayList<Integer>();
    static ArrayList<Integer> ans = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.");
        System.out.println();
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list1.add(n);
        }
        System.out.print("Your first list: [");
        for (int i = 0; i < list1.size(); i++) {
            if (i == list1.size() - 1) {
                System.out.print(list1.get(i));
            } else {
                System.out.print(list1.get(i) + ", ");
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.");
        System.out.println();
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list2.add(n);
        }
        System.out.print("Your second list: [");
        for (int i = 0; i < list2.size(); i++) {
            if (i == list2.size() - 1) {
                System.out.print(list2.get(i));
            } else {
                System.out.print(list2.get(i) + ", ");
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.print("Your interleaved list: [");
        interleave();
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.print(ans.get(i));
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
    public static void interleave() {
        int j = 0;
        while (j < Math.max(list1.size(), list2.size())) {
            if (j < list1.size()) {
                ans.add(list1.get(j));
            }
            if (j < list2.size()) {
                ans.add(list2.get(j));
            }
            j++;
        }
    }
}
