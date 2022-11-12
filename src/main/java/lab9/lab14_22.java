package lab9;

public class lab14_22 {
    public static void main(String[] args) {
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0'};

        String[] code
                = {".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--..", "|"};

        String morseCode = "... -.-. .... --- --- .-..   ... -.-. .... --- --- .-..";
        String englishLang = "alice";
        morseToEnglish(code, morseCode);
        System.out.println();
        englishToMorse(code, englishLang, letter);
    }

    public static void morseToEnglish(String[] code, String morseCode) {
        String[] tokens = morseCode.split("   ");
        for (int k = 0; k < tokens.length; k++) {
            String[] word = tokens[k].split(" ");
            for (int i = 0; i < word.length; i++) {
                for (int j = 0; j < code.length; j++) {
                    if (word[i].compareTo(code[j]) == 0) {
                        System.out.print((char) (j + 'a') + " ");
                        break;
                    }
                }
            }
            System.out.print("  ");
        }
    }

    public static void englishToMorse(String[] code, String englishLang, char[] letter) {
        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }

    }

}
