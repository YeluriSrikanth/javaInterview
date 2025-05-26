package InterviewQ;

public class FindDigits {
    public static void main(String[] args) {
        int n = 12, r = 0, count = 0;
        int temp=n;
        while (n > 0) {
            r = n % 10;
            if (temp % r == 0) {
                count++;

            }
            n=n/10;




        }
        System.out.println(count);
    }
}
