package generics;

public interface Func<T,R>{
        R apply(T e);
        default <S> S compos(T args,Func<R,S> g){
            return g.apply(apply(args));
        }
}
