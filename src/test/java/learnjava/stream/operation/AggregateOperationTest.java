package learnjava.stream.operation;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {
    @Test
    public void testMax() {
        List.of("adib", "eko", "setiawan", "budi").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    public void testMin() {
        List.of("adib", "eko", "setiawan", "budi").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    public void testCount() {
        long count = List.of("adib", "eko", "setiawan", "budi").stream()
                .count();
        System.out.println(count);
    }

    @Test
    public void testReduce() {

        Integer results = List.of(1, 2, 3, 4).stream()
                .reduce(0, Integer::sum);
//        flow
//        identity=0
//        value=0 item=1 =1
//        value=1 item=2 =3
//        value=3 item=3 =6
//        value=6 item=4 =10
//        results = 10
        Integer factorial = List.of(1, 2, 3, 4).stream()
                .reduce(1, (value, item) -> value * item);

    }
}
