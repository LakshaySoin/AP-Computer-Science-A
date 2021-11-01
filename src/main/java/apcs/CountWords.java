import java.util.*;
import java.io.*;

public class CountWords {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter name of text file, e.g. Iliad.txt: ");
        String file = temp.next();
        Scanner scanner = new Scanner(new File(file));
        int ans = 0;
        while (scanner.hasNext()) {
            String word = scanner.next();
            ans++;
        }
        System.out.println("Total words = " + ans);
    }
}
