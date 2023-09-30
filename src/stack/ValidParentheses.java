package stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("["));
        System.out.println(isValid("){"));
        System.out.println(isValid("(("));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            boolean isOpeningBracket = "([{".indexOf(c) != -1;
            if (isOpeningBracket) {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (!isCorrespondingBracket(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();

    }

    private static boolean isCorrespondingBracket(Character closing, Character opening) {
        return ('(' == closing && ')' == opening) || ('[' == closing && ']' == opening) || ('{' == closing && '}' == opening);
    }

}
