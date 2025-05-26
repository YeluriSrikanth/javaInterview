package InterviewQ;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParentheses {

    public static String removeUnbalancedParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(sb.length());
                sb.append(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = ")())";
        String output = removeUnbalancedParentheses(input);
        System.out.println("Input: " + input + ", Output: " + output);
    }
}