package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeComparator {
    public static void main(String[] args) {
        List<Employee> list = getEmployeeList();

        //Collections.sort(list,(o1,o2)->(o1.getSal()>o2.getSal())?-1:o1.getSal()<o2.getSal()?1:0);
        Comparator<Employee> c=(e1,e2)->(e1.getSal()<e2.getSal())?-1:(e1.getSal()>e2.getSal())?1:0;
        Collections.sort(list,c);



System.out.println(list);

    }

    public static List<Employee> getEmployeeList() {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("13031f0018","rama",18,"Hyderabad"));
        list.add(new Employee("13031f0019","krishna",62,"Hyderabad"));
        list.add(new Employee("13031f0020","hare",25,"Khammam"));
        list.add(new Employee("13031f0018","rama",12,"Hyderabad"));
        list.add(new Employee("13031f0021","shiva",1,"Misore"));
        return list;
    }
}
