package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRecord {
    public static void main(String[] args) {


        List<Employee> empList = new ArrayList<>();
        Arrays.asList(
                new Employee("121", "srikanth", "Hyderabad", "IT", 55000),
                new Employee("121", "srikanth", "Hyderabad", "IT", 55000),
                new Employee("121", "srikanth", "Hyderabad", "IT", 55000),
                new Employee("121", "srikanth", "Hyderabad", "IT", 55000));


    }

}

record Employee(String empId, String name, String city, String dep, double sal) {
}
