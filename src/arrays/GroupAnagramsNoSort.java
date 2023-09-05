package arrays;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Given an array of strings, group the anagrams together.
 * You can return the answer in any order.
 * */
public class GroupAnagramsNoSort {

    public static void main(String[] args) {

        String[] strings1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strings2 = {""};
        String[] strings3 = {"a"};
        String[] strings4 = {"bdddddddddd","bbbbbbbbbbc"};

        System.out.println(groupAnagrams(strings1));
        System.out.println(groupAnagrams(strings2));
        System.out.println(groupAnagrams(strings3));
        System.out.println(groupAnagrams(strings4));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {

            String charCount = createCharCountString(str);

            if (!result.containsKey(charCount)) {
                result.put(charCount, new ArrayList<>());
            }
            result.get(charCount).add(str);
        }

        return result.values().stream().toList();
    }

    private static String createCharCountString(String str) {

        int[] result = new int[26];

        for (char character : str.toCharArray()) {
            int charIndex = ((int) character) - ((int) 'a');
            result[charIndex] = result[charIndex] + 1;
        }

        return Arrays.stream(result).mapToObj(String::valueOf)
                .collect(Collectors.joining("_"));

    }

}
