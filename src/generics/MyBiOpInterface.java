package generics;

@FunctionalInterface
public interface MyBiOpInterface<T>{
    T apply(T a, T b);
}
