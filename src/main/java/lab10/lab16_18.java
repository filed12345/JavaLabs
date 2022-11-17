package lab10;

import java.util.*;

public class lab16_18 {
    public static void main(String[] args) {
        Character[] characters = {'a','y','w','u','h','t','f','n','b','j'};
        List<Character> characterList = Arrays.asList(characters);
        System.out.println("First list :"+characterList);
        Character[] sizecopy = new Character[characters.length];
        List<Character> copyList = Arrays.asList(sizecopy);
        Collections.copy(copyList,characterList);
        Collections.reverse(copyList);
        System.out.println("Copied&reversed list :"+copyList);
    }
}
