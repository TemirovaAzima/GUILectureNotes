package generics;

import java.util.ArrayList;
import java.util.List;

public class MyBiOp {
    public static void main(String[] args){
        List<MyBiOpInterface<Double>> opers = new ArrayList<>();

        // addition
        opers.add(Double:: sum);

        // substraction
        opers.add(new MyBiOpInterface<Double>(){
            @Override
            public Double apply(Double a, Double b){
                return a -b;
            }
        });

        //
        opers.add(new Mult());

        // division - lambda
        opers.add((a,b)->a/b);

        // with closure ('shift' is effectively final)
        int shift = 10;
        opers.add((a,b)-> a/b + shift);

        for (MyBiOpInterface <Double> op: opers){
            System.out.println(op.apply(10.5,3.5));
        }

    }
}
