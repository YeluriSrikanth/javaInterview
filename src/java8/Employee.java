package java8;

public class Employee {
    String id;
    String name;
    double sal;
    String city;

    public Employee(String id, String name, double sal, String city) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", city='" + city + '\'' +
                '}';
    }
}
