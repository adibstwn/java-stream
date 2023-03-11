package learnjava.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class StreamCreateTest
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void createStream(){
        Stream<String> empty = Stream.empty();

        String data = null;
        Stream<String> nullableData = Stream.ofNullable(data);

        Stream<String> createFromData = Stream.of("eko");

        Integer[] datas = new Integer[]{
                1,2,3,4
        };

        Stream<Integer> createFromArray = Arrays.stream(datas);
        String dataaa = "asdfasdf";
//        string to char doesn't work
        Character[] da = new Character[]{
                '1', '2'
        };
        Stream<Character> createFromString = Arrays.stream(da);

        Collection<Integer> dataCollection = List.of(1,2,3,4,5);
        Stream<Integer> createStreamFromCollection = dataCollection.stream();


        System.out.println("Empty stream data");
        empty.forEach(System.out::println);
        System.out.println("createFromData stream data");
        createFromData.forEach(System.out::println);
        System.out.println("null stream data");
        nullableData.forEach((item) -> System.out.println(item));
//        stream hanya bisa dijalankan sekali,
    }

    @Test
    public void infiniteStream(){
        Stream<Integer> generate = Stream.generate(() -> 1);
//        generate.forEach(System.out::println);
        Stream<Integer> iterate = Stream.iterate(1, seedValue -> seedValue + 1);
//        iterate.forEach(System.out::println);
    }


}
