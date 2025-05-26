package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> list = EmployeeComparator.getEmployeeList();
        Arrays.asList(12, 3, 56, 789).stream().max(Comparator.comparing(Integer::intValue)).get();
        Arrays.asList("srirama", "krishna", "arjuna").stream().max(Comparator.comparing(String::length)).get();
        double sal = list.stream().max(Comparator.comparing(Employee::getSal)).get().sal;
        System.out.println(sal);

        Arrays.asList(12, 2, 3, 4, 5).stream().mapToInt(i -> i).sum();

        double avg = list.stream().mapToDouble(Employee::getSal).average().getAsDouble();
        System.out.println(avg);


      Map<String, Double> map=  list.stream()
                .collect(Collectors.groupingBy(Employee::getCity,Collectors.averagingDouble(Employee::getSal)));

      System.out.println(map);


    List<Long> resList= Arrays.asList(12,12,34,56,1,34,56,34).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet().stream().map(Map.Entry::getValue).filter(m->m>1).toList();
           // collect(Collectors.toList());
System.out.println(resList);


int fr=Arrays.asList(1,2,3,3,4,4).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(m->m.getKey()%2==0).max(Map.Entry.comparingByValue()).get().getKey();

System.out.println(fr);

Arrays.asList(12,2,3,4,5,6,7,8).stream().reduce(Integer::sum);



    }
}
