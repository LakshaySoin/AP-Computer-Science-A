public class Point {
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
    public double slope(Point coor) {
        return (double) (coor.y - this.y) / (coor.x - this.x);
    }
}
