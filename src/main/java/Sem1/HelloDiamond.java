public class HelloDiamond {
    public static void main(String[] args) {
        top();
        System.out.println("| Hello  |");
        bottom();
        top();
        System.out.println("| World! |");
        bottom();
    }

    public static void top() {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  \\    /");
        System.out.println("   \\  /");
        System.out.println("    \\/");
    }
}
