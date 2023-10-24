package functional_interface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

    private final IntPredicate isPrime = (o) -> {
        for (int i = 2; i <= (int) Math.sqrt(o); i++) {
            if (o % i == 0) {
                return false;
            }
        }
        return true;
    };

    private final IntPredicate isOdd = (o) -> o % 2 == 0;

    public boolean isEven(int a) {
        return a % 2 == 1;
    }

    public boolean test(IntPredicate function, int a) {
        return function.test(a);
    }

    public void test() {
        System.out.println(test(isPrime, 9));
        System.out.println(test(isOdd, 7));
        Predicate<Integer> test = this::isEven;
    }
}
