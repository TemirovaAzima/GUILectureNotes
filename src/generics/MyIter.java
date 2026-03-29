
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIter implements Iterable<String>,Iterator<String> {

    private String str;
    private int curInd =0;
    MyIter(String s) {str = s;}

    @Override
    public Iterator<String> iterator(){
        return this;
    }

    @Override
    public boolean hasNext(){
        return curInd < str.length();
    }

    @Override
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        return str.substring(curInd,++curInd);
    }

}

void main(){
//    for(String c : new MyIter("ABCDEF")) IO.print(c + " ");
//    IO.println();
//    MyIter str = new MyIter("hello");
//    while (str.hasNext()){
//        // I can call it again here just to be sure...
//        if (str.hasNext()) {
//            System.out.println(str.next()); // ONLY NOW does the state change
//        }
//    }
    Iterator<String> it = new MyIter("ABC");
    System.out.println(it.hasNext());
    System.out.println(it.hasNext());
    System.out.println(it.next());
    System.out.println(it.hasNext());
}