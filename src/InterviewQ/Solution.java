package InterviewQ;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        String specialPattern = ".*[!@#$%^&*()-+].*";
        int count=0;
        String alpha = ".*[a-zA-Z].*";
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(specialPattern);
        boolean hasAlpha = password.matches(alpha);
        System.out.println(hasAlpha);
        System.out.println(password.length());
        if(password.length()<n){
            return n-password.length();

        }
        if(!hasAlpha){
            count++;
        }
        if(!hasDigit)
            count++;
        if(!hasSpecial)
            count++;

        return count;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {


        int answer = Result.minimumNumber(3, "abc");
        System.out.println(answer);


    }
}
