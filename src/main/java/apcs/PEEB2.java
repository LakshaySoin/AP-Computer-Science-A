import java.util.Scanner;

public class PEEB2 {
    public static final Scanner scanner = new Scanner(System.in);
    private static final double BoltzmannConstant = 5.67e-8;
    private static final double SSun = 6.42e7;
    private static final int sunRadius = 700000;
    public static void main(String[] args) {
        System.out.println("Calculate radiant power per unit area for Sun and Planet using");
        System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
        System.out.println("(Power in) = (Power out), predict temperature of Planet.");
        System.out.print("Planet: ");
        String planet = scanner.next();
        System.out.print("distance of Planet from Sun (AU): ");
        double distance = scanner.nextDouble();
        distance *= 1.50e8;
        System.out.print("radius of Planet (km): ");
        int radius = scanner.nextInt();
        System.out.print("albedo of Planet: ");
        double albedo = scanner.nextDouble();
        System.out.println("photon flux SP = " + Math.round(calculatePhotonFlux(distance)));
        System.out.println("average photon flux SAve = " + Math.round(calculateAveragePhotonFlux(distance)));
        System.out.println("including albedo SAve x (1 - alpha) = " + Math.round(calculateAlbedo(distance, albedo)));
        System.out.println("temperature TP (K) = " + Math.round(calculateTemperature(distance, albedo)));
        System.out.println("temperature TP (C) = " + Math.round((calculateTemperature(distance, albedo) - 273.15)));
    }

    public static double calculatePhotonFlux(double distance) {
        double ans = ((SSun * 4 * Math.PI * Math.pow(sunRadius, 2)) / (4 * Math.PI * Math.pow(distance, 2)));
        return ans;
    }

    public static double calculateAveragePhotonFlux(double distance) {
        double ans = (calculatePhotonFlux(distance) / 4);
        return ans;
    }

    public static double calculateAlbedo(double distance, double albedo) {
        double ans = (calculateAveragePhotonFlux(distance) * (1 - albedo));
        return ans;
    }

    public static double calculateTemperature(double distance, double albedo) {
        double ans = Math.pow((calculateAlbedo(distance, albedo)/ BoltzmannConstant), 0.25);
        return ans;
    }
}
