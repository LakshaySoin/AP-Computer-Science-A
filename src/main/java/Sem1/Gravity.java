public class Gravity {
    public static void main(String[] args) {
        int[][] numbers = {{0, 2, 4, 0}, {1, 0, 0, 2}, {3, 4, 9, 0}, {2, 0, 6, 0}};
        gravity(numbers);
    }

    public static void gravity(int[][] numbers) {
        for (int i = numbers.length - 1; i > -1; i--) {
            if (i != numbers.length - 1) {
                for (int x = 0; x < numbers[i].length; x++) {
                    int index = i;
                    if (numbers[index][x] == 0) {
                        while (numbers[index + 1][x] != 0) {
                            int temp = numbers[index + 1][x];
                            numbers[index + 1][x] = numbers[index][x];
                            numbers[index][x] = temp;
                            index++;
                            if (index >= numbers.length - 1) {
                                break;
                            }
                        } 
                    }
                }
            }
        }
        printArray(numbers);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
    }
}
