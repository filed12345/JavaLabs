package lab10;

import java.util.*;

public class lab16_16 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }
    public static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:"); //Hi, i am Freddy and i am a good person, Freddy. hi I AM!
        String line = input.nextLine();
        String[] tokens = line.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            if (word.contains(",")||word.contains(".")||word.contains("!")){
               String truncWord = token.substring(0,token.length()-1);
               truncWord = truncWord.toLowerCase();
                if (map.containsKey(truncWord)) {
                    int count = map.get(truncWord);
                    map.put(truncWord, count + 1);
                } else {
                    map.put(truncWord, 1);
                }
            }else {
                if (map.containsKey(word)) {
                    int count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
            }

        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
