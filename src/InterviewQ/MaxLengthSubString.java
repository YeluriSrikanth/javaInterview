package InterviewQ;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class MaxlengthSubString {
    public  static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int l = 0, r = 0, max = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (!set.contains(ch)) {
                set.add(ch);
                r++;
                max = Math.max(max, set.size());
            } else {
                //System.out.println(set);
                set.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(set);
        return max;
    }

    public static void main(String[] args) {
        String s="srikanthisagoodbiy";
        System.out.println(lengthOfLongestSubstring(s));
    }



}

