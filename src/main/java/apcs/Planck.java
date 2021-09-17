package main.java.apcs;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Planck {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("0.00E00");
        System.out.println("Radiant photon flux at a given wavelength");
        System.out.println("and temperature using Planck's Law.");
        System.out.print("wavelength in microns: ");
        int wavelength = scanner.nextInt();
        System.out.print("temperature in degrees Kelvin: ");
        int temperature = scanner.nextInt();
        double radiation = calculateRadiation(wavelength, temperature);
        System.out.println("radiant flux B = " + df1.format(radiation).toLowerCase() + " Wm-3steradian-1");
    }

    public static double calculateRadiation(int wavelength, int temperature) {
        double h = 6.626068e-34;
        int c = 299792500;
        double k = 1.38066e-23;
        double wl = wavelength * 1e-6;
        int T = temperature;
        double output = (2 * h * Math.pow(c, 2)) * Math.pow(wl, -5) / (Math.exp((h * c)/(wl * k * T)) - 1);
        return output;
    }
}
