package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotationOfArray {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5}, d= 6;
        List<Integer> list=new ArrayList<>();
        d = d % ar.length;
        System.out.println(d);
        for (int i = 0; i < d; i++) {
            int first = ar[0], j;
            for (j = 0; j < ar.length - 1; j++) {
                ar[j] = ar[j + 1];

            }
            ar[j] = first;

        }
        System.out.println(Arrays.toString(ar));
    }
}
