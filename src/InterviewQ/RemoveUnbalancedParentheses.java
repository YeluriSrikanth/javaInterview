package InterviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveUnbalancedParentheses {

    public static String removeUnbalanced(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                sb.append(c);
               // stack.push(sb.length());
                list.add(sb.length());
            } else if (c == ')') {
                if (!list.isEmpty()) {
                    list.remove(list.size()-1);
                   // stack.pop();
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
System.out.println(list.size());

        }
        while (list.size()<=0) {
            System.out.println(sb.deleteCharAt(list.remove(list.size()-1)));

        }
        System.out.println(stack);
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "a)b(c)d(";
        String output = removeUnbalanced(input);
        System.out.println("Input: " + input + ", Output: " + output); // Prints: Input: a)b(c)d, Output: ab(c)d
    }
}