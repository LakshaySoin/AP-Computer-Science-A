import java.util.*;

public class Reverse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.");
        System.out.println();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }
        System.out.print("Your original list: [");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
        System.out.println();
        ArrayList<Integer> ans = reverse(list);
        System.out.print("Your reversed3 list: [");
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.print(ans.get(i));
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        int i = 0;
        int j = 2;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (i < list.size() && j < list.size()) {
            ans.add(list.get(j));
            ans.add(list.get(i + 1));
            ans.add(list.get(i));
            i += 3;
            j += 3;
        }
        while (i < list.size()) {
            ans.add(list.get(i));
            i++;
        }
        return ans;
    }
}
