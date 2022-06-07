import java.util.*;

public class Count2 {
    static class Pair implements Comparable<Pair> {
        String string;
        int val;
        public Pair(String string, int val) {
            this.string = string;
            this.val = val;
        }
        @Override
        public int compareTo(Count2.Pair o) {
            return Integer.compare(val, o.val);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.");
        System.out.println();
        ArrayList<String> set = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String a = scanner.next();
            if (a.equals("lastString")) {
                break;
            }
            boolean good = true;
            for (String i : set) {
                if (i.equals(a.toLowerCase())) {
                    good = false;
                }
            }
            if (good) {
                set.add(a.toLowerCase());
            }
            strings.add(a.toLowerCase());
        }
        int[] occurences = new int[set.size()];
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < set.size(); j++) {
                if (strings.get(i).equals(set.get(j))) {
                    occurences[j]++;
                }
            }
        }
        Pair[] pairs = new Pair[set.size()];
        for (int i = 0; i < set.size(); i++) {
            pairs[i] = new Pair(set.get(i), occurences[i]);
        }
        Arrays.sort(pairs);
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i].string + " " + pairs[i].val);
        }
    }
}

