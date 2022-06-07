import java.util.*;

public class ArrayListPart1 {
    static class Person implements Comparable<Person> {
        String name;
        int age;
        double weight;
        public Person(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        @Override
        public int compareTo(ArrayListPart1.Person o) {
            if (!name.equals(o.name)) {
                return name.compareTo(o.name);
            } else if (age != o.age) {
                return Integer.compare(age, o.age);
            } else {
                return Double.compare(weight, o.weight);
            }
        }
        @Override
        public String toString() {
            return "{" + name + ", " + age + ", " + weight + "}";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();
        while (true) {
            String name = scanner.next();
            if (name.equals("stop")) {
                break;
            }
            int age = scanner.nextInt();
            double weight = scanner.nextDouble();
            people.add(new Person(name, age, weight));
        }
        System.out.println("Original list: ");
        System.out.println(people.toString());
        System.out.println();
        Collections.sort(people);
        System.out.println("Sorted list: ");
        System.out.println(people.toString());
    }
}