package InterviewQ;

import java.util.Objects;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReducedString {
    public static void main(String[] args) {
        String s="abbdca";
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.empty()) {
                if (stack.peek() != c) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }else{
                stack.push(c);
            }

        }
        System.out.println(stack.empty()?"Empty String":stack.stream().map(Objects::toString).collect(Collectors.joining()));
        System.out.println(s);

    }
}
