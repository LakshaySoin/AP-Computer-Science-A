import java.util.*;
import java.io.*;

public class RemoveEvensForReal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Removes strings of even length from an array.");
        System.out.print("Enter filename for file containing strings: ");
        String file = sc.next();
        Scanner scanner = new Scanner(new FileReader(file));
        System.out.println("Enter two indices for range of odd words to be printed out: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        LinkedList<String> list = new LinkedList<String>();
        int initialSize = 0;
        int size = -1;
        while (scanner.hasNext()) {
            String a = scanner.next();
            if (a.length() % 2 == 1) {
                size++;
                if (size >= start && size <= end) {
                    list.add(a);
                }
            }
            initialSize++;
        }
        System.out.println("initial list.size(): " + initialSize);
        System.out.println("final   list.size(): " + (size + 1));
        System.out.println("odd words from index " + start + " to " + end + ":");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
