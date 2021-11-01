public class HarmonicSeriesTimed {
    public static void main(String[] args) {
        final double startTime = System.currentTimeMillis();
        HarmonicSeries(2); //the method that you want to time
        final double endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

    public static void HarmonicSeries(double limit) {
        int cnt = 1;
        double divisor = 2.0;
        double sum = 1.0;
        final double startTime = System.currentTimeMillis();
        while (sum <= limit) {
            sum += (1/divisor);
            divisor++;
            cnt++;
        }
        final double endTime = System.currentTimeMillis();
        System.out.println("Total execution time per term: " + ((endTime - startTime) / cnt));
        System.out.print("Actual sum = ");
        System.out.printf("%.5f", sum);
        System.out.println("\nNumber of terms required: " + cnt);
    }
}
