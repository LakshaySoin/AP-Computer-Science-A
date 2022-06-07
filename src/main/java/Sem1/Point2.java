import java.util.*;

public class Point2 {
    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this.x = 0;
            this.y = 0;
        }
        public void translate(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }
        public int getX() {
            return this.x;
        }
        public int getY() {
            return this.y;
        }
        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getQuadrant() {
            if (this.x > 0 && this.y > 0) {
                return 1;
            } else if (this.x < 0 && this.y > 0) {
                return 2;
            } else if (this.x < 0 && this.y < 0) {
                return 3;
            } else {
                return 4;
            }
        }
        public double distanceToOrigin() {
            return Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
        }
        @Override
        public String toString() {
            return "(" + this.x + ", " + this.y + ")";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point mooDefault = new Point();
        System.out.println("mooDefault = (" + mooDefault.x + ", " + mooDefault.y + ")");
        System.out.print("Enter x-value: ");
        int x = scanner.nextInt();
        System.out.print("Enter y-value: ");
        int y = scanner.nextInt();
        Point moo = new Point(x, y);
        System.out.println("moo = (" + moo.x + ", " + moo.y + ")");
        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
        System.out.println(moo.toString());
        System.out.println("Quadrant: " + moo.getQuadrant());
        System.out.println("Distance to origin: " + moo.distanceToOrigin());
    }
}
