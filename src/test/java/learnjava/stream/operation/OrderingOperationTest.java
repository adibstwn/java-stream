package learnjava.stream.operation;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    public void testSorted() {
//        sorted by default comparable data
        List.of("adib", "eko", "setiawan", "budi").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void testSortedWithComparator() {
        Comparator<String> comparator = Comparator.reverseOrder();
        List.of("adib", "eko", "setiawan", "budi").stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
