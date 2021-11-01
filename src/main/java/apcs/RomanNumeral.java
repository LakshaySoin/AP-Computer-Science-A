import java.util.Scanner;
import java.util.TreeMap;

public class RomanNumeral {
    public static final Scanner scanner = new Scanner(System.in);
    public static final TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    public static void main(String[] args) {
        System.out.print("enter two positive integers, smaller followed by larger: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        for (int i = a; i <= b; i++) {
            System.out.println(convertToRomanNumeral(i));
        }
    }

    public static String convertToRomanNumeral(int num) {
        int n = map.floorKey(num);
        if (n == num) {
            return map.get(num);
        }
        return map.get(n) + convertToRomanNumeral(num - n);
    }
}
