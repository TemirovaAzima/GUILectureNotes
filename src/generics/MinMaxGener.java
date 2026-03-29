package generics;

public class MinMaxGener {
    public static void main(String[] args){
        GenArr<Integer> mnmxI = new GenArr<>(new Integer[]{3,-2,-7,2});
        GenArr<String> mnmxS = new GenArr<>(new String[]{"A","Z","C"});

        System.out.println("I - min = " + mnmxI.getMin() + "\nI - max = " + mnmxI.getMax());
        System.out.println("I - min = " + mnmxS.getMin() + "\nI - max = " + mnmxS.getMax());
    }
}
