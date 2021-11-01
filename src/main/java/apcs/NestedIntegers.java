public class NestedIntegers {
    public static void main(String[] args) {
        dashes();
        face();
        integers();
        dashes();
    }

    public static void dashes() {
        for (int i=0; i<40; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void face() {
        for (int i=0; i<10; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
    }

    public static void integers() {
        for (int i=0; i<2; i++) {
            for (int x=1; x<11; x++) {
                for (int y=0; y<2; y++) {
                    System.out.print(x % 10);
                }
            }
        }
        System.out.println();
    }
}
