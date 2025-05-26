package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sortwith012 {
    public static void main(String[] args) {
        String s="((()))";
        List<Character> list=new ArrayList<>();
        for (int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='(') {
                list.add(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(s.charAt(i-1)!='('){
                    list.remove(s.charAt(i-1));
                }else{
                    list.add(s.charAt(i));
                }

            }

        }
        System.out.print(list);
    }
}
