package lab9;

import java.util.Scanner;

public class lab14_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur string: ");
        String s = input.nextLine();
        String[] tokens = s.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            printLatinWord(tokens[i]);
        }
    }

    public static void printLatinWord(String token) {
        char firstchar = token.charAt(0);
        String newString = "";
        for (int i = 1; i < token.length(); i++) {
            newString += token.charAt(i);
        }
        newString += firstchar + "ay";
        System.out.print(newString.toLowerCase() + " ");
    }
}
