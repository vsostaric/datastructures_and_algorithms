package arrays;

import java.util.*;

/*
 * Given an array of strings, group the anagrams together.
 * You can return the answer in any order.
 * */
public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strings1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strings2 = {""};
        String[] strings3 = {"a"};

        System.out.println(groupAnagrams(strings1));
        System.out.println(groupAnagrams(strings2));
        System.out.println(groupAnagrams(strings3));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> stringSortedChars = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = Arrays.toString(charArr);
            if (stringSortedChars.containsKey(sortedString)) {
                stringSortedChars.get(sortedString).add(str);
            } else {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(str);
                stringSortedChars.put(sortedString, arr);
            }
        }

        return stringSortedChars.values().stream()
                .toList();
    }

}
