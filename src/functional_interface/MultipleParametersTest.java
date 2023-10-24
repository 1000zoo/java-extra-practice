package functional_interface;

public class MultipleParametersTest {
    static final MultipleParameters<Integer, Integer, Integer, Integer> testFunction = (o1, o2, o3) -> o1 + o2 + o3;

    public static void main(String[] args) {
        int a = testFunction.doSomething(5, 43, 2);
        System.out.println("a = " + a);
    }
}
