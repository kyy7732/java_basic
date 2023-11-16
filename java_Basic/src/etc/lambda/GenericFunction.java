package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {


    // X에서 Y를 추출해 줄게.
    Y apply(X x); // x를 받아서 y를 줌

}
