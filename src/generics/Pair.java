package generics;

public class Pair <F,S>{
    public static int count = 0;
    private F first;
    private S second;
    public Pair(F f,S s){
        count++;
        first = f;
        second = s;
    }
    public F getFirst(){return first;}
    public S getSecond() { return  second;}
    public void setFirst(F f){ first = f;}
    public void setSecond(S s){ second = s;}

}

