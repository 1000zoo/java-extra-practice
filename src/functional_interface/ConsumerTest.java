package functional_interface;

import java.util.function.Consumer;

public class ConsumerTest {

    private final Consumer<Integer> consumer = (i) -> {
        System.out.println("i = " + i);
    };

}
