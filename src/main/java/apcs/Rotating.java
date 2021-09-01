package main.java.apcs;

public class Rotating {
    public static final String nums = "12340";
    public static final int reps = 50;
    public static void main(String[] args) {
        intervals();
        integers();
    }

    public static void intervals() {
        for (int i=1; i <= reps; i++) {
            if (i % nums.length() == 0) {
                System.out.print("|");  
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void integers() {
        for (int i = 0; i < reps/nums.length(); i++) {
            System.out.print(nums);
        }
        System.out.println();
    }
}
