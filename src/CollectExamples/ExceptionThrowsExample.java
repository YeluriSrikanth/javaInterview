package CollectExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class ExceptionThrowsExample {
    public static void main(String[] args){
        try {
            System.out.println(ExceptionThrowsExample.fileread());
        }catch (FileNotFoundException f){
            System.out.println("file not found exception");

        }
    }

    public static int fileread() throws FileNotFoundException {
        File file=new File("C:\\Users\\91891\\OneDrive\\Desktop\\test.txt");
        BufferedReader bf=new BufferedReader(new FileReader(file));
        Stream<String> str=bf.lines();
        str.parallel().forEach(System.out::println);
        return 12;
    }



}
