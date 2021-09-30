package main.java.apcs;

import java.awt.*;

public class ColorWheel {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(512, 512);
        Graphics g = panel.getGraphics();

        int x = 0;

        while (true) {
            x += 5;

            Color color = new Color(255, 0, 0);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 0 + x % 360, 60);

            color = new Color(255, 255, 0);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 60 + x % 360, 60);

            color = new Color(0, 255, 0);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 120 + x % 360, 60);

            color = new Color(0, 255, 255);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 180 + x % 360, 60);

            color = new Color(0, 0, 255);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 240 + x % 360, 60);

            color = new Color(255, 0, 255);
            g.setColor(color);
            g.fillArc(50, 50, 400, 400, 300 + x % 360, 60);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) { }
        }
    }
}
