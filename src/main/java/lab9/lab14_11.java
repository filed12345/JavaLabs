package lab9;

import java.util.Scanner;

public class lab14_11 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur string: ");
        String s = input.nextLine();
        System.out.println("Enter a searching symbol: ");
        String symbol = input.nextLine();
        for (int i = 0;i<s.length();i++){
            int match = s.indexOf(symbol,i);
            if (match == i){
                counter++;
            }else {
                continue;
            }
        }
        System.out.println(counter);
    }
}
