package main.java.apcs;

import java.awt.*;

public class DrawLine {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        g.drawLine(25, 75, 175, 25);
    }
}
