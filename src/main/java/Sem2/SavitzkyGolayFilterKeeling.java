import java.util.*;
import java.awt.*;
import java.io.*;

public class SavitzkyGolayFilterKeeling {
    public static void main(String[] args) throws FileNotFoundException{
        DrawingPanel panel = new DrawingPanel(800, 400);
        Graphics g = panel.getGraphics();
        Scanner console = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<Double>();
        g.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        for (int i=0;i<697;i++) {
            int x=i;
            double y= console.nextDouble()-310;
            data.add(y);
            g.drawOval(x,((400-(4*(int)y))),1,1);
        }

        for (int i=10; i<697; i+=24){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 8));
            g.drawString(""+(1960+i/12),i,397);
            g.drawLine(i,390,i,380);
        }

        g.setColor(Color.BLUE);
        console= new Scanner(System.in);
        System.out.println("Enter an integer for the width of the window (in months):");
        int window = console.nextInt();
        int w = window/2;
        double[] avg = new double[697-w];

        for (int i=w; i<697-w; i++){
            double sum=0;
            for (int j = i-w;j<i+w;j++ ) {
                sum+=data.get(j);
            }
            double average = sum/(double)window;
            avg[i] = average;
            g.drawOval(i,((400-((int)(average*4)))),1,1);
        }

        System.out.println("select Savitsky-Golay filter: ");
        System.out.println("smoothing");
        System.out.println(" quadratic or cubic");
        System.out.println("  0   {  0, 0,-3,12,17,12,-3, 0,  0}");
        System.out.println("  1   {  0,-2, 3, 6, 7, 6, 3,-2,  0}");
        System.out.println("  2   {-21,14,39,54,59,54,39,14,-21}");
        System.out.println(" quartic or quintic");
        System.out.println("  3   { 0,  5,-30, 75,131, 75,-30,  5, 0}");
        System.out.println("  4   {15,-55, 30,135,179,135, 30,-55,15}");
        System.out.println();
        System.out.println("1st derivative");
        System.out.println(" linear or quadratic");
        System.out.println("  5   { 0, 0, 0,-1,0,1,0,0,0}");
        System.out.println("  6   { 0, 0,-2,-1,0,1,2,0,0}");
        System.out.println("  7   { 0,-3,-2,-1,0,1,2,3,0}");
        System.out.println("  8   {-4,-3,-2,-1,0,1,2,3,4}");
        System.out.println(" cubic or quartic");
        System.out.println("  9   { 0,   0,   1,  -8,0,  8, -1,  0,  0}");
        System.out.println("  10  { 0,  22, -67, -58,0, 58, 67,-22,  0}");
        System.out.println("  11  {86,-142,-193,-126,0,126,193,142,-86}");
        System.out.print("Enter an integer 0 - 11 corresponding to desired filter: \n");

        int filter = console.nextInt();

        int[][] c ={{0, 0, -3, 12, 17, 12, -3, 0, 0},{0, -2, 3, 6, 7, 6, 3, -2, 0},{-21, 14, 39, 54, 59, 54, 39, 14, -21},{ 0,  5,-30, 75,131, 75,-30, 5, 0},{15,-55, 30,135,179,135, 30,-55,15},{ 0, 0, 0,-1,0,1,0,0,0},{ 0, 0,-2,-1,0,1,2,0,0},{ 0,-3,-2,-1,0,1,2,3,0},{-4,-3,-2,-1,0,1,2,3,4},{ 0,0,1,-8,0,8,-1,0,0},{ 0,22, -67, -58,0, 58, 67,-22,  0},{86,-142,-193,-126,0,126,193,142,-86}};
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.BOLD, 16));
        g.setColor(Color.RED);
        for (int i=4;i<697-16;i++ ){
            double smoothing = 4*((c[filter][0]*avg[i-4])+(c[filter][1]*avg[i-3])+(c[filter][2]*avg[i-2])+(c[filter][3]*avg[i-1])+(c[filter][4]*avg[i])+(c[filter][5]*avg[i+1])+(c[filter][6]*avg[i+2])+(c[filter][7]*avg[i+3])+(c[filter][8]*avg[i+4]));
            g.drawOval(i,400-((int)(4.0*smoothing)),1,1);
        }
    }
}