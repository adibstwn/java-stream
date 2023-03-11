package learnjava.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
    @Test
    public void intermediateOperation() {
//        contoh intermediate adalah map method, intermediate tidak akan bekerja selama tidak ada terminal operation
        List<String> names = List.of("ad", "bs");
        Stream<String> test = names.stream()
                .map(name -> {
                    System.out.println("Changing " + name + " to Upper case");
                    return name.toUpperCase();
                });
    }

    @Test
    public void terminalOperation() {
//        contoh terminal operation adalah forEach method
//        flow dari stream berbeda dengan collection, dimana stream hanya akan mengalirkan satu value sampai selesai chainingnya, kemudian dilanjutkan dengan data selanjutnya sampai selsesai
        List<String> names = List.of("ad", "bs");
        names.stream()
                .map(name -> {
                    System.out.println("Changing " + name + " to Upper case");
                    return name.toUpperCase();
                })
                .map(upper ->{
                    System.out.println("Adding name " + upper + " with Mr. ");
                    return "Mr. " + upper;
                })
                .forEach(System.out::println);
    }
}
