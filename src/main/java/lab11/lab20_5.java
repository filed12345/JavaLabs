package lab11;

public class lab20_5 {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        try {
            System.out.printf("%nArray integerArray contains:%n");
            printArray(integerArray, 0, 4); // pass an Integer array
            System.out.printf("%nArray doubleArray contains:%n");
            printArray(doubleArray, 0, 5); // pass a Double array
            System.out.printf("%nArray characterArray contains:%n");
            printArray(characterArray, -3, 2); // pass a Character array
        } catch (Exception e) {
            throw new InvalidSubscriptException(e.getMessage());
        }

    }

    public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException {
        // display array elements
        for (int i = lowSubscript; i <= highSubscript; i++) {
            System.out.print("\t"+inputArray[i]);

        }
    }

    public static class InvalidSubscriptException extends RuntimeException {
        public InvalidSubscriptException(String message) {
            super(message);
        }
    }
}
