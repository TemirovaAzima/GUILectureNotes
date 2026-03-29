package generics;

public class Composit {
    public static void main(String[] args){
        Func<String,Integer> f = s -> s.length();
        System.out.println("g(f(\"abc\")) = " + f.compos("abc", v -> v*Math.PI));
    }
}
