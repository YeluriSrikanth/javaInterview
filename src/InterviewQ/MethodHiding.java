package InterviewQ;

public class MethodHiding {
    public static void main(String[] args) {

        Parent p = new Child();
        p.nonStatic();
        Parent c=new Parent();



    }

}

class Parent {
    public static void display() {
        System.out.println("parent static ");
    }

    public void nonStatic() {
        System.out.println("Non static Parent");
    }


}

class Child extends Parent {

    public static void display() {
        System.out.println("Child static ");
    }

    public void nonStatic() {
        System.out.println("Non static Child");
    }


}