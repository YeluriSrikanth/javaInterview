package CollectExamples;
import java8.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java8.EmployeeComparator.getEmployeeList;
public class PartitioningExample {
    public static void main(String[] args) {
       Map<Boolean,List<Employee>> map= getEmployeeList().stream()
                .collect(Collectors.partitioningBy(e->e.getSal()>20));
     //  System.out.println(map);

        //for Set type
        Map<Boolean, Set<Employee>> map1= getEmployeeList().stream()
                .collect(Collectors.partitioningBy(e->e.getSal()>20,Collectors.toSet()));

       for(Boolean b:map.keySet()){
           for (Employee obj:map.get(b)){
System.out.println(obj);

           }

       }

    }

}
