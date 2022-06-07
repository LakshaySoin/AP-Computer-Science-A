import java.util.*;

public class RemoveInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.");
        System.out.println();
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String a = scanner.next();
            if (a.equals("lastString")) {
                break;
            }
            list.add(a);
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
        System.out.println("Now please enter your start String");
        String start = scanner.next();
        System.out.println();
        System.out.println("Finally, please enter your end String");
        String end = scanner.next();
        System.out.println();
        ArrayList<String> ans = removeInRange(list, start, end);
        System.out.print("Your reduced list: [");
        for (int i = 0; i < ans.size(); i++) {
            if (i == ans.size() - 1) {
                System.out.print(ans.get(i));
            } else {
                System.out.print(ans.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
    public static ArrayList<String> removeInRange(ArrayList<String> list, String start, String end) {
        boolean[] remove = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int compare1 = start.compareTo(list.get(i));
            int compare2 = end.compareTo(list.get(i));
            if (compare1 <= 0 && compare2 >= 0) {
                remove[i] = true;
            }
        }
        int j = 0;
        for (int i = 0; i < remove.length; i++) {
            if (remove[i]) {
                list.remove(j);
            } else {
                j++;
            }
        }
        return list;
    }
}
