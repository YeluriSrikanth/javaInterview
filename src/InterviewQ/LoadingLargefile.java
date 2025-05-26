package InterviewQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LoadingLargefile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\91891\\OneDrive\\Desktop\\test.txt");
        Scanner obj = new Scanner(file);
        while (obj.hasNext()) {
            System.out.println(obj.nextLine());


        }


    }
}
