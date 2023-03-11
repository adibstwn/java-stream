package learnjava.stream;

import org.junit.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamBuilderTest {
    @Test
    void streamBuilder(){
        Stream<Object> builder = Stream.builder().add("one").add("two data").build();
    }
}
