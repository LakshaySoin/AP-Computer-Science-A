import java.util.Scanner;

public class PEEB4 {
    static double BoltzmannConstant = 5.67e-8, albedo = 0.3, SSun = 6.42e7, distance = 1.5e8;
    static int sunRadius = 700000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate surface temperature as a function of");
        System.out.println("emissivity for the single-layer atmosphere model.");
        System.out.print("enter emissivity: ");
        double e = scanner.nextDouble();
        System.out.println("emissivity (= absorptivity) = " + e);
        System.out.println("surface temperature = " + surfaceTemperature(e) + "K");
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

    public static int surfaceTemperature(double e) {
        double ans = ((2 * calculateAlbedo(distance, albedo))) / ((BoltzmannConstant) * (2 - e));
        return (int) Math.pow(ans, 0.25) - 1;
    }
}
