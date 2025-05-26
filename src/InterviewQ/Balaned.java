package InterviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Balaned {
    public static void main(String[] args) {
        String s = "[{()}]";
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                System.out.println(stack);

            } else {
                if (
                        (stack.peek() == '(' && c== ')') ||
                                (stack.peek() == '{' && c== '}') ||
                                (stack.peek() == '[' && c == ']')
                ) {
                    System.out.println(stack);
                    stack.pop();

                }
            }

        }
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("NOt Balance");
        }
    }
}




