package InterviewQ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatcher {
    public static void main(String[] args) {

        String str = "Pass12#word";
        if(str.length()<=6){
            System.out.println(6-str.length());

        }
        String specialPattern = ".*[!@#$%^&*()-+].*";
        String alpha = ".*[a-zA-Z].*";
        boolean hasDigit = str.matches(".*[0-9].*");
        boolean hasSpecial = str.matches(specialPattern);
        boolean hasAlpha = str.matches(alpha);

        System.out.println("String: " + str);
        System.out.println("Contains digit: " + hasDigit);
        System.out.println("Contains special character: " + hasSpecial);
        System.out.println("Contains character: " + hasAlpha);

    }
}
