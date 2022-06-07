public class SlashFigure {
    public static void main(String[] args) {
        for (int i=0; i<6; i++) {
            for (int x=0; x<i; x++) {
                System.out.print("\\\\");
            }
            for (int y=0; y < -4 * i + 22; y++) {
                System.out.print("!");
            }
            for (int x=0; x<i; x++) {
                System.out.print("//");
            }
            System.out.println();
        }
    }
}
