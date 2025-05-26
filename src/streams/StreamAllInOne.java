package streams;

import java.util.List;
import java.util.stream.Collectors;

import static java8.EmployeeComparator.getEmployeeList;

public class StreamAllInOne {
    public static void main(String[] args) {

        List<String> list=getEmployeeList().stream()
                .map(obj->obj.getName())
                .sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(list);


    }
}
