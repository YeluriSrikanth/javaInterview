package coreJava;

import java.util.Scanner;

public class FactoryMethodExample {
    public static void main(String[] args) {
        FeeStruture f = new Driver().getFee();
        System.out.println(f.getFees());

    }


}
interface FeeStruture{

    public double getFees();

}

class Cse implements FeeStruture{

    @Override
    public double getFees() {
        return 50000;
    }
}

class Ece implements FeeStruture{

    @Override
    public double getFees() {
        return 7000000;
    }
}

class Driver{
    public static FeeStruture getFee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Branch ");
        String branch=sc.next();
        if(branch.equals("CSE")){
            return new Cse();

        }else {
            return new Ece();
        }

    }
}