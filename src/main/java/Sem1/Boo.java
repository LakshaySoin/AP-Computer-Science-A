public class Boo {
    public static void main(String[] args) {
        int[] array = {1, 0, 30, 9, 0, 0, 26, 15};
        pull(array);
    }

    public static void pull(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && i != 0) {
                int index = i;
                while (array[index - 1] != 0) {
                    int temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp; 
                    index--;
                    if (index < 1) {
                        break;
                    }
                }
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
}
