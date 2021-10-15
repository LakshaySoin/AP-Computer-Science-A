package main.java.apcs;

import java.awt.*;

public class ColorWheel {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(800, 800);
        Graphics g = panel.getGraphics();

        int x = 0;

        g.drawOval(25, 25, 725, 725);

        while (true) {
            x += 5;

            drawColorWheel(g, x, 0);
            drawColorWheel(g, x, 300);
            smile(g, x);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) { }
        }

    }

    public static void drawColorWheel(Graphics g, int x, int change) {
        Color color = new Color(255, 0, 0);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 0 + x % 360, 60);

        color = new Color(255, 255, 0);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 60 + x % 360, 60);

        color = new Color(0, 255, 0);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 120 + x % 360, 60);

        color = new Color(0, 255, 255);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 180 + x % 360, 60);

        color = new Color(0, 0, 255);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 240 + x % 360, 60);

        color = new Color(255, 0, 255);
        g.setColor(color);
        g.fillArc(150 + change, 150, 175, 175, 300 + x % 360, 60);
    }

    public static void smile(Graphics g, int x) {
        Color color = new Color(255, 0, 0);
        g.setColor(color);
        g.fillArc(165 + x % 175, 400, 250, 200, 180, 180);

        color = new Color(255, 255, 0);
        g.setColor(color);
        g.fillArc(170 + x % 180, 400, 250, 200, 180, 180);

        color = new Color(0, 255, 0);
        g.setColor(color);
        g.fillArc(175 + x % 185, 400, 250, 200, 180, 180);

        color = new Color(0, 255, 255);
        g.setColor(color);
        g.fillArc(180 + x % 190, 400, 250, 200, 180, 180);

        color = new Color(0, 0, 255);
        g.setColor(color);
        g.fillArc(185 + x % 195, 400, 250, 200, 180, 180);

        color = new Color(255, 0, 255);
        g.setColor(color);
        g.fillArc(190 + x % 200, 400, 250, 200, 180, 180);
    }
}
