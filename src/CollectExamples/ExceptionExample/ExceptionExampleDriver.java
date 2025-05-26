package CollectExamples.ExceptionExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExampleDriver {
    public static void main(String[] args) {

    }
}
class Parent{
    public void display() throws IOException {
        File file=new File("");
            Scanner sc = new Scanner(file);
    }


}
class Child extends  Parent{
    public void display() throws FileNotFoundException {
        File file=new File("");
            Scanner sc = new Scanner(file);
    }
}
