public class Window { 
    public static void main(String[] args) {
        String frame = "+===+===+";
        String glass = "|   |   |";

        for (int i=0; i<2; i++) {
            System.out.println(frame);
            for (int x=0; x<3; x++) {
                System.out.println(glass);
            }
        }
        System.out.println(frame);
    }
}
