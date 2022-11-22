package lab11.lab20_8;

public class PairTest {
    public static void main(String[] args) {
        GenericClassPair<Integer,Double> numbers = new GenericClassPair();
        numbers.setValue(2);
        numbers.setValue2(3.0);
        System.out.println(numbers);
    }
}
