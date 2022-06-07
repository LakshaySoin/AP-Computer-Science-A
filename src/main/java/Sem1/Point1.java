public class Point1 {
    int x, y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
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
}
