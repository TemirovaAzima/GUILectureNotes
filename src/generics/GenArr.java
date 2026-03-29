package generics;

public class GenArr <T extends Comparable<T>>{
    private T[] arr;
    private T min, max;

    public GenArr(T[] arr){
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException();
        min = arr[0];
        max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(min)<0) min = arr[i];
            if(arr[i].compareTo(max)>0) max = arr[i];
        }
    }
    public T getMin() {return min;}
    public T getMax() {return max;}
}

