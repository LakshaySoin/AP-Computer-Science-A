public class StarFigure {
    public static final int length = 6;
    public static void main(String[] args) {
        int x = (length - 1) * 4;
        int y = 0;
        int j = (length - 1) * 4;

        for (int i = 0; i < length; i++){
            for (int k = 0; k < x; k++) {
                System.out.print('/');
            }
            for (int l = 0; l < y; l++) {
                System.out.print('*');
            }
            for (int n = 0; n < j; n++) {
                System.out.print('\\');
            }
            System.out.println();

            x -= 4;
            y += 8;
            j -= 4;
        }
    }
}
