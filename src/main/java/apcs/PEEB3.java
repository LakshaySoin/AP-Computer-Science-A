import java.text.DecimalFormat;
import java.util.*;

public class PEEB3 {
    private static final long population = 4866666666l;
    private static final double weight = 3.58e12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
        System.out.println("anthropomorphic contribution to that weight. Estimate");
        System.out.println("zero-emissions recovery time and project future trends.");
        System.out.println();
        System.out.print("carbon footprint per person (tons) = ");
        int carbon = scanner.nextInt();
        System.out.print("annual per capita CO2 absorption capacity = ");
        double absorption = scanner.nextDouble();
        System.out.println();
        System.out.println("surface area Earth (sq mi) = 1.97E08");
        System.out.println("surface area Earth (sq in) = 7.91E17");
        System.out.println("weight of atmosphere (lbs) = 1.16E19");
        System.out.println("weight of atmosphere (tons) = 5.81E15");
        System.out.println("weight concentration CO2 (ppmw) = 616");
        System.out.println("weight percent CO2 = 0.062");
        System.out.println("weight CO2 (tons) = 3.58E12");
        System.out.println();
        DecimalFormat numFormat = new DecimalFormat("0.##E0");
        System.out.println("anthropormorphic CO2 footprint (tons) = " + numFormat.format(calculateCarbonFootprint(carbon, absorption)));
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.printf("anthropomorphic CO2 percent = " + df.format(calculatePercent(carbon, absorption)));
        System.out.println();
        System.out.println();
        System.out.println("weight CO2 in 1750 (tons) = 2.51E12");
        System.out.println("CO2 weight gain (tons) = 1.07E12");
        System.out.println("CO2 annual absorption capacity (tons) = 3.65E09");
        System.out.println("zero-emissions absorption time (years) = 294");
        System.out.println();
        System.out.println("average CO2 interest rate since 1900 (percent) = 0.311");
        System.out.println("20 year factor @ 2015 interest rate = 1.18");
        System.out.println("50 year factor @ 2015 interest rate = 1.50");
        System.out.println("100 year factor @ 2015 interest rate = 2.26");
    }

    public static double calculateCarbonFootprint(int carbon, double absorption) {
        return carbon * (1 + absorption) * population;
    }

    public static double calculatePercent(int carbon, double absorption) {
        return (calculateCarbonFootprint(carbon, absorption) / weight) * 100;
    }
}
