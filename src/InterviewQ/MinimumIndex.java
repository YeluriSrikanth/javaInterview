package codeRandom;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinimumIndex {
    public static void main(String[] args) {
        int ar[] = { -5, -3, 8, 13, 4, 0 };
        int min = ar.length;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == i && min >= ar[i]) {
                min = ar[i];
            }

        }

        Arrays.stream(ar).boxed();
        OptionalInt m = IntStream.range(0, ar.length).filter(t -> ar[t] == t).min();
        int sum = 0;

        System.out.println(m.getAsInt());

//		OptionalInt indexOpt = IntStream.range(0, users.size())
//			     .filter(i -> searchName.equals(users.get(i)))
//			     .findFirst();

    }

}
