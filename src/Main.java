import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] newArray = new int[]{1, 2, 3};
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        char[] charArray = {'a', 'b', 'c'};
        // Exercise 2
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(charArray));
        // Exercise 3
        for (int index = 2; index >= 0; index--) {
            System.out.print(newArray[index] + " ");
        }
        System.out.println();
        for (int index = 2; index >= 0; index--) {
            System.out.print(doubleArray[index] + " ");
        }
        System.out.println();
        for (int index = 2; index >= 0; index--) {
            System.out.print(charArray[index] + " ");
        }
        System.out.println();
        // Exercise 4
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 != 0) {
                newArray[i] = newArray[i] + 1;
            }
            System.out.print(newArray[i] + " ");
        }
    }
}