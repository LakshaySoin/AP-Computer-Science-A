import java.util.*;

public class Clump {
    static ArrayList<String> arr = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a sequence of strings separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value \"stop\", followed by a return.");
        System.out.println();
        while (true) {
            String n = scanner.next();
            if (n.equals("stop")) {
                break;
            }
            arr.add(n);
        }
        System.out.print("Your original list: [");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.print(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.print("Your clumped list: [");
        clump();
        System.out.println("]");
    }
    public static void clump() {
        String prev = "";
        String curr = "";
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 1) {
                curr = arr.get(i);
                if (i == arr.size() - 1) {
                    System.out.print("(" + prev + " " + curr + ")");
                } else {
                    System.out.print("(" + prev + " " + curr + "), ");
                }
            } else {
                prev = arr.get(i);
            }
            if (arr.size() % 2 == 1 && i == arr.size() - 1) {
                System.out.print(arr.get(i));
            }
        }
    }
}
