package streams;

public class People {
    private String name;

    People(String s){
        this.name=s;

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
