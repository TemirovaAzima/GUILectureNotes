package generics;

import java.util.ArrayList;
import java.util.List;

public class Tools1 {
    public static <T> T foldl(Operat<T> op, List<T> list, T id){
        T acc = id;
        for(T e : list)
            acc = op.oper(acc,e);
        return acc;
    }

    public static <T> List<T> combine(Operat<T> op, List<T> l1, List<T> l2){
        List<T> res = new ArrayList<>();
        int size = Math.min(l1.size(),l2.size());
        for (int i =0; i < size; i++)
            res.add(op.oper(l1.get(i),l2.get(i)));
        return res;
    }
}
