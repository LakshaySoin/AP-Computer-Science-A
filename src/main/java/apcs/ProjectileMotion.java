package main.java.apcs;

import java.awt.*;
import java.util.*;


public class ProjectileMotion {

   public static final double a = 9.8;
   public static final int v = 30;
   public static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
       System.out.print("Please enter the start angle in degrees: ");
       double initialTheta = scanner.nextDouble();

       System.out.print("Please enter the final angle in degrees: ");
       double finalTheta = scanner.nextDouble();

       System.out.print("Please enter the step size in degrees: ");
       double increments = scanner.nextDouble();

       DrawingPanel panel = new DrawingPanel(1000,1600);
       Graphics g = panel.getGraphics();
       int n =1;

       while (initialTheta <= finalTheta) {
           getDataPoints(initialTheta, g, n);

           initialTheta = initialTheta + increments;
           n++;
       }
       printExtraStuff(g);
   }

   public static void printExtraStuff(Graphics g) {
       g.setColor(Color.BLACK);
       g.fillRect(20,20,4,900);
       g.fillRect(20, 920,1000, 4);
       g.drawString("Horizontal vs Veritcal distance with different launch angles",400,500);
       g.drawString("Horizontal Distance Traveled", 400,950);
       g.drawString("V", 3,400);
       g.drawString("e", 3,412);
       g.drawString("r", 3,424);
       g.drawString("t", 3,436);
       g.drawString("i", 3,448);
       g.drawString("c", 3,460);
       g.drawString("a", 3,478);
       g.drawString("l", 3,490);
       g.drawString("Legend",10,970);
   }


   public static void getDataPoints(double intialAngle, Graphics g, int n) {
       Color color = new Color((int)Math.floor(Math.random()*(200-0+1)+0),(int)Math.floor(Math.random()*(200-0+1)+0),(int)Math.floor(Math.random()*(200-0+1)+0));
       g.setColor(color);

       if (n <= 45 ) {
           g.drawString("Angle = "+ intialAngle,10,980 +11* n);
       } else if (n > 40) {
           g.drawString("Angle = "+ intialAngle,120,485 + 11* n);
       }

       intialAngle = Math.toRadians(intialAngle);

       double totalTime = 2 * v * Math.sin(intialAngle) / a;

       double intervalLength = totalTime / 200;
       double j = intervalLength;


       double xv = Math.cos(intialAngle) * v;
       double yv = Math.sin(intialAngle) * v;

       double y = 0;
       double x = 0;

       while (intervalLength <= totalTime) {

           y = yv * intervalLength - 0.5 * a * intervalLength * intervalLength;
           x = xv * intervalLength;

           x = Math.round(x * 10);
           y = Math.round(y * 10);


           int x1 = (int)x;
           int y1 = (int)y;
           g.fillOval(x1+20, 916 - y1, 5, 5);

           intervalLength = intervalLength + j;
       }
   }
}

