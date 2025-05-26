package CollectExamples;

import java8.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java8.EmployeeComparator.getEmployeeList;

public class GroupingExample {
    public static void main(String[] args) {
     Map<String,Long> map=getEmployeeList().stream()
                .collect(Collectors.groupingBy(e->e.getCity(),Collectors.counting()));
        System.out.println(map);

       Map<String,List<String>> resMap= getEmployeeList().stream()
                .collect(Collectors.groupingBy(e->e.getCity(),Collectors.mapping(e->e.getName(),Collectors.toList())));
       //System.out.println(resMap);


       Map<String, Optional<Double>> map2=getEmployeeList().stream().collect(Collectors.groupingBy(e->e.getCity(),
               Collectors.mapping(e->e.getSal(),Collectors.reducing(Double::sum))));
       //System.out.println(map);


       Map<String,Double> res=getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.summingDouble(Employee::getSal)));

       //System.out.println(res);

       Map<String,Optional<Employee>> s= getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getCity,
                Collectors.maxBy(Comparator.comparing(Employee::getSal))));

      double sal= getEmployeeList().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal))).get().getSal();


     //  System.out.println(sal);




    }
}
