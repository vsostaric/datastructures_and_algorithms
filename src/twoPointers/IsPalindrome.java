package twoPointers;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("amanaplanacanalpanama"));
        System.out.println(isPalindrome("raceacar"));
        System.out.println(isPalindrome(" "));

    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {

                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;

            }

        }

        return true;
    }
}
