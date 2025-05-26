package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java8.EmployeeComparator.getEmployeeList;

public class MapMerger {
    public static void main(String[] args) {
        Map<String, String> map = getEmployeeList().stream()
                .collect(Collectors.toMap(
                        obj -> obj.getCity(),
                        obj -> obj.getName(),
                        (a, b) -> a + "_" + b


                ));

        System.out.println(map);
    }
}
