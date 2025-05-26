package coreJava;

import java.util.Scanner;

public class AbstractExample {
    public static void main(String[] args) {
        Fruit f=new DriverClass().getBeans();
        System.out.println("object type is"+f.getClass());
        f.getTaste();
    }
}

abstract class Fruit{

    public  abstract String getTaste();

   // public abstract String getSession();

    public void getType(){
        System.out.println("type of fruit is ");
    }

}
class Lemon extends Fruit{


    @Override
    public String getTaste() {
        return "Sour";
    }
}

class Grape extends Fruit{


    @Override
    public String getTaste() {
        System.out.println("Grape ");
        return "Sweet";
    }
}
class DriverClass{
    public Fruit getBeans(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Fruit name ");
        String fr=s.next();
        if(fr.equalsIgnoreCase("Lemon")){
            return new Lemon();
        }else if(fr.equalsIgnoreCase("grape")){
            return new Grape();
        }else{
            return null;
        }


    }

}

