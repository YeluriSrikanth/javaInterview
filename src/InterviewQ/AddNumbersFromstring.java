package InterviewQ;

public class AddNumbersFromstring {
    public static void main(String[] args) {
        String s = "1sri45kanthyo9et5";
        int sum = 0;
        String temp = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp += s.charAt(i);
                if (Character.isDigit(s.charAt(i + 1)) && i < s.length() - 1) {
                    temp += s.charAt(i + 1);


                }
                sum += Integer.parseInt(temp);
                temp="";


            }

        }
        System.out.println(sum);

    }
}
