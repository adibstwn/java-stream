package learnjava.stream.operation;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    public void testLimit() {
        List.of("adib", "setiawan", "santoso", "andi", "budiman").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List.of("adib", "setiawan", "cita", "andi").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void testTakeWhile() {
//        jika filter akan mencari data sesuai kondisi dan takeWhile akan berhenti jika kondisinya tidak terpenuhi, dalam kasus dibawah hanya akan mengambil data yg pertama

        List.of("adib", "setiawan", "cita", "andi").stream()
                .filter(name -> name.length() <= 4)
                .forEach(System.out::println);

        List.of("adib", "bro", "setiawan", "cita", "andi").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    public void testDropWhile() {
        List.of("adib", "bro", "setiawan", "cita", "andi").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    public void testRetrievingSingleElement() {
        Optional<String> findAnyTest = List.of("bro", "adib", "setiawan", "cita", "andi").stream()
                .findAny();

        System.out.println(findAnyTest.get()); //jika dengan method get ada kemungkinan throw null pointer exception
        findAnyTest.ifPresent(name -> { //pakau ifPresent untuk menghindari exception
            System.out.println(name);
        });

        Optional<String> findFirstTest = List.of("bro", "adib", "setiawan", "cita", "andi").stream()
                .findFirst();
        System.out.println(findFirstTest.get()); //jika dengan method get ada kemungkinan throw null pointer exception
        findFirstTest.ifPresent(name -> { //pakau ifPresent untuk menghindari exception
            System.out.println(name);
        });
    }
}
