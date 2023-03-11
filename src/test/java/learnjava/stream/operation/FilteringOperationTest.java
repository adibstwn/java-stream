package learnjava.stream.operation;

import org.junit.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    public void filteringOperationTest() {
        List.of("adib", "setiawan", "santoso", "andi").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);
        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(number -> number % 2 ==0)
                .forEach(System.out::println);
        List.of(1,1,1,3,2,2,4,4,6,6,5,7,7).stream()
                .distinct()
                .forEach(System.out::println);
    }
}
