package learnjava.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void x(){

    }
    @Test
    public void name() {
        List<Integer> numbers = List.of(1,2,3,4);
        Stream<Integer> integerStream = numbers.stream();
        Stream<Integer> integerStreamUpdated = integerStream.map(num -> num + 5);

    }
}
