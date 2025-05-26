package InterviewQ;

public class ProfitAndBuy {
    public static void main(String[] args) {
        int ar[] = {12, 2, 9, 22, 1, 16, 5};
        int buy = ar[0], profit = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < buy) {
                buy = ar[i];
            } else {
                profit = Math.max(ar[i]-buy, profit);

            }


        }

        System.out.println(buy+"     "+profit);
    }
}
