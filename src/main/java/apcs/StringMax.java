package main.java.apcs;

import java.util.Arrays;
import java.util.Scanner;

public class StringMax {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        String str = scanner.next();
        maxChar(str);
        System.out.println("in order:     " + inOrder(str));
    }

    public static void maxChar(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            ans = Math.max(ans, (int) str.charAt(i));
        }
        System.out.println("max char:     " + (char) ans);
    }

    public static String inOrder(String str) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr); 
    }
}
