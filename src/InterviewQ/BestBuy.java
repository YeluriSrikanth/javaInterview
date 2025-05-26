package InterviewQ;

public class BestBuy {

    public static void main(String[] args) {
        int ar[] = { 2, 4, 1, 7, 19,21 };
        int p = 0;
        int buy = 0;
        buy = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (buy > ar[i]) {
                buy = ar[i];

            } else if (ar[i] - buy > p) {
                p = ar[i] - buy;

            }

        }
        System.out.println(p);

    }


}
