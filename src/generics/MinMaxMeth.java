package generics;

public class MinMaxMeth {
    static <T extends Comparable<T>> T getMax (T[] arr){
        if(arr == null || arr.length ==0)
            throw new IllegalArgumentException();
        T max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if(arr[i].compareTo(max) > 0) max = arr[i];
        return max;
    }

    public static void main(String[] args){
        int mxi = getMax(new Integer[]{3,-2,-7,2});
        String mxs = MinMaxMeth.<String>getMax(new String[]{"A","Z","C"});
        System.out.println("I - Max = " +mxi);
        System.out.println("S - Max = " +mxs);
    }
}
