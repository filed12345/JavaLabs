package lab9;

import java.security.SecureRandom;

public class lab14_5 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        String s;

        for (int i = 0; i < 20; i++) {
            int value;
            s = article[value = randomNumbers.nextInt(5)] + " " +
                    noun[value = randomNumbers.nextInt(5)] + " " +
                    verb[value = randomNumbers.nextInt(5)] + " " +
                    preposition[value = randomNumbers.nextInt(5)] + " " +
                    article[value = randomNumbers.nextInt(5)] + " " +
                    noun[value = randomNumbers.nextInt(5)] + ".";
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.println(s);
        }
    }
}
