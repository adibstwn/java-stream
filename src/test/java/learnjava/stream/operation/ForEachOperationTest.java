package learnjava.stream.operation;

import org.junit.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    public void testPeekBefore() {
        List.of("adinb", "budi").stream()
                .map(name -> {
                    System.out.println("Before upper " + name);
                    String upper = name.toUpperCase();
                    System.out.println("After upper " + upper);
                    return upper;
                })
                .forEach(finall -> System.out.println("Final " + finall));
    }

    @Test
    public void testPeekAfter() {
//        peek bukan terminal operator
        List.of("adinb", "budi").stream()
                .peek(name -> System.out.println("Before upper " + name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("After upper " + name))
                .forEach(name -> System.out.println("Final " + name));
    }
}
