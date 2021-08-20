package main.java.apcs;

public class xyMachine {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i=1; i < 100; i++) {
            array[i] = i;
        }
        for (int i=1; i < array.length - 1; i++) {
            array[i + 1] = array[i] * array[i + 1] + array[i] + array[i + 1];
        }
        System.out.println(array[array.length - 1]);
    }
}
