package arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.equals(t)) {
            return true;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> sCharacters = getCharCounts(s);
        Map<String, Integer> tCharacters = getCharCounts(t);

        return sCharacters.equals(tCharacters);

    }

    private static Map<String, Integer> getCharCounts(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.toMap(
                                Function.identity(),
                                x -> 1,
                                (Integer a, Integer b) -> a + 1
                        ));
    }
}