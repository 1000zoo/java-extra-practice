package functional_interface;

@FunctionalInterface
public interface MultipleParameters<A, B, C, D> {
    D doSomething(A a, B b, C c);
}
