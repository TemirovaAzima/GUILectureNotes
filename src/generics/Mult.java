package generics;

public class Mult implements MyBiOpInterface<Double>{
    @Override
    public Double apply(Double a, Double b){ return a*b;}
}
