package learnjava.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    public void pipeLine() {
//        biasanya ketika melakukan operasi stream akan langsung dijadikan satu kesatuan yg disebut pipeline / chaining
        List<String> names = List.of("adib", "setiawan", "pekalongan");
        names.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }
}
