package main.java.apcs;

public class TwoRockets {
    public static void main(String[] args) {
        triangle();
        squareSection();
        middleSection();
        squareSection();
        triangle();
    }

    public static void triangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void squareSection() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void middleSection() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
