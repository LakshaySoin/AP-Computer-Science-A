import java.util.ArrayList;

public class Armstrong {
    public static void main(String[] args) {
        findArmstrongNumbers("1", "10000000");
    }
    
    public static void findArmstrongNumbers(String lowerbound, String upperbound) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int lower = Integer.parseInt(lowerbound);
        int upper = Integer.parseInt(upperbound);
        int sum;
        for (int i = lower; i <= upper; i++) {
            String temp = Integer.toString(i);
            sum = 0;
            for (int k = 0; k < temp.length(); k++) {
                sum += Math.pow(Double.parseDouble(String.valueOf(temp.charAt(k))), temp.length());
            }
            if (sum == i) {
                arrayList.add(sum);
            }
        }

        for (int k = 0; k < arrayList.size(); k++) {
            System.out.println(arrayList.get(k));
        }
    }
}
