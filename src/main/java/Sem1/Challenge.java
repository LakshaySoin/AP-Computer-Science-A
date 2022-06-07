

public class Challenge {
    public static void main(String[] args) {
        int money = 31415;
        double hotDogs = 1.50;
        double chickenBakes = 312.52;

        double amountChickenBakes = money / chickenBakes;
        double amountHotDogs = (money - (chickenBakes * (int) amountChickenBakes)) / hotDogs;
        double moneyLeft = money - ((chickenBakes * (int) amountChickenBakes) + (hotDogs * (int) amountHotDogs));

        System.out.println(moneyLeft);
        System.out.println((int) amountChickenBakes);
        System.out.println((int) amountHotDogs);
    }
}
