package lab9;

import java.util.Scanner;

public class lab14_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur string: ");
        String s = input.nextLine();
        String[] tokens = s.split(" ");
        for (int i = tokens.length-1;i>=0;i--){
            System.out.print(tokens[i]+" ");
        }
    }
}
