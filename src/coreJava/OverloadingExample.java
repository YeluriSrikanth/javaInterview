package coreJava;

public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(10);
        obj.display("srikanth");
        obj.display(new StringBuffer("sri"));
//obj.display(10.0);
        obj.display('a');
//obj.display(null);
        obj.display(10, 20, 30);


    }

    public void display(int x) {
        System.out.println("int args" + x);
    }

    public void display(String x) {
        System.out.println("String method " + x);

    }
    public String returnSomething(String s){
        return "HI Srikanth";
    }

    public void display(StringBuffer br) {
        System.out.println("String buffer" + br);
    }

    public String display(float x) {
        System.out.println("float value" + x);
        return "";
    }

    public void display(int... x) {
        System.out.println("int array  " + x);
    }

}
