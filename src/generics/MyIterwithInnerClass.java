import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterwithInnerClass implements Iterable<String> {
    private String str;
    private int curInd =0;
    MyIterwithInnerClass(String s) {str = s;}

    class Iter implements Iterator<String>{
        @Override
        public boolean hasNext(){
            return curInd < str.length();
        }

        @Override
        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            return str.substring(curInd, ++curInd);
        }
    }

    @Override
    public Iterator<String> iterator(){
        return new Iter();
    }
}

void main(){
    for(String c : new MyIterwithInnerClass("ABCDEF")) IO.print(c+ " ");
    IO.println();


}