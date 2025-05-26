package InterviewQ;

public class BuilingFacesSun {


    public static void main(String[] args) {
        int ar[] = {6, 2, 8, 4, 11, 13};
        int cnt = 1;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] < ar[i + 1]) {
                cnt++;

            }

        }
        System.out.println(cnt);

    }
}
