package lab10;

import java.util.*;

public class lab16_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");// John Alex Maria Serghei Vova Maria Oleg John
        String names;
        names = input.nextLine();
        String[] tokens = names.split(" ");
        List<String> list = Arrays.asList(tokens);
        Set<String> set = new HashSet<>(list);
        System.out.printf("%nNonduplicates are: ");
        for (String values : set) {
            System.out.println(values);
        }
        System.out.println("Enter searching first name:");
        String firstName = input.nextLine();
        if (set.contains(firstName)) {
            System.out.println(firstName + " was found in the set.");
        } else {
            System.out.println(firstName + " was not found in the set.");
        }

    }
}
