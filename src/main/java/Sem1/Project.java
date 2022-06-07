import java.util.Scanner;
import java.text.DecimalFormat;

public class Project {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println();
        System.out.println("This program computes the spherical distance");
        System.out.println("between two points, 1 and 2");
        System.out.println();
        System.out.println("Please enter the latitude and longitude for");
        System.out.println("each point as a pair of integers, degrees");
        System.out.println("followed by minutes:");
        System.out.println();
        System.out.print("latitude 1: ");
        double lat1_d = scanner.nextDouble();
        double lat1_p = scanner.nextDouble();
        System.out.print("longitude 1: ");
        double long1_d = scanner.nextDouble();
        double long1_p = scanner.nextDouble();
        System.out.println();
        System.out.print("latitude 2: ");
        double lat2_d = scanner.nextDouble();
        double lat2_p = scanner.nextDouble();
        System.out.print("longitude 2: ");
        double long2_d = scanner.nextDouble();
        double long2_p = scanner.nextDouble();
        System.out.println();
        String ans = df.format(angularDistance(lat1_d, lat1_p, long1_d, long1_p, lat2_d, lat2_p, long2_d, long2_p)).toLowerCase();
        System.out.println("Angular distance = " + ans + " radians");
        long distance = Math.round(angularDistance(lat1_d, lat1_p, long1_d, long1_p, lat2_d, lat2_p, long2_d, long2_p) * 6372.795);
        System.out.println("Distance = " + distance + " kilometers");
        System.out.println("Distance = " + Math.round(distance * 0.621371) + " miles");
        System.out.println();
    }

    public static double angularDistance(double lat1, double lat1p, double long1, double long1p, double lat2, double lat2p, double long2, double long2p) {
        lat1 = Math.toRadians(lat1 + (lat1p/60));
        long1 = Math.toRadians(long1 + (long1p/60));
        lat2 = Math.toRadians(lat2+ (lat2p/60));
        long2 = Math.toRadians(long2 + (long2p/60));

        double thing = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long2 - long1);

        double ans = Math.acos(thing);
        return ans;
    }
}