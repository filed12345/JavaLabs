package lab9;

import java.util.Scanner;

public class lab14_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur string: ");
        String s = input.nextLine();
        String[] tokens = s.split(" ");
        for (String newToken: tokens) {
            if (newToken.endsWith("ED")){
                System.out.println(newToken);
            }
        }
    }
}
