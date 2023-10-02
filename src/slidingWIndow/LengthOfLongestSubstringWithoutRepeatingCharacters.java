package slidingWIndow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bacabcbb"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        int left = 0;
        int right = 0;

        Set<Character> inSubstring = new HashSet<>();

        while (right < s.length()) {

            if (!inSubstring.contains(s.charAt(right))) {
                inSubstring.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                inSubstring.remove(s.charAt(left));
                left++;
            }

        }

        return maxLength;

    }

}
