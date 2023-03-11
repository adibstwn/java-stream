package learnjava.stream.operation;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    public void testMapOperation() {
//        merubah satu bentuk ke bentuk yg lain, contoh int ke string
        List.of(1,2,3,4).stream()
                .map(n -> n + 5)
                .map(sum -> "Number " + sum)
                .forEach(System.out::println);
    }

    @Test
    public void testFlatMapOperation() {
        List.of(1,2,3,4).stream()
                .map(n -> n + 5)
                .flatMap(sum -> Stream.of(sum, sum + 5))
//                akan menduplikat sesuai jumlah data yg ada dalam stream of.
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }
}
