package learnjava.stream.operation;

import org.junit.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    public void testAny() {
        boolean any = List.of(1, 2, 3, 4, 5, 21).stream()
                .anyMatch(number -> number > 20);
    }

    @Test
    public void testAll() {
        boolean all = List.of(1, 2, 3, 4, 5, 21).stream()
                .allMatch(number -> number > 20);
    }

    @Test
    public void testNone() {
        boolean noneMatch = List.of(1, 2, 3, 4, 5, 21).stream()
                .noneMatch(number -> number > 20);
    }
}
