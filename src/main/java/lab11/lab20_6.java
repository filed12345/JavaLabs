package lab11;

import java.util.Arrays;

public class lab20_6 {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strings = {"H", "E", "L", "L", "O", "H", "E", "L", "L", "O"};
        System.out.printf("%nArray integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
        System.out.println();
        printArray(strings);

    }

    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 4 == 0) {
                System.out.println();
                System.out.print(strings[i] + " ");
            } else {
                System.out.print(strings[i] + " ");
            }
        }
    }


}
