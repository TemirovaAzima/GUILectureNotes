import java.io.ObjectOutput;
import java.util.Objects;

public class Outer {
    private String sOut;
    Outer(String s ) { sOut = s;}

    static class Inner {
        private String sInn;
        Inner(String s) {sInn = s;}
        @Override
        public String toString(){
            return "Inner-" + sInn + " parent " +
                    "Outer-" ;
        }
    }
    public Inner getInner(String i){
        Inner inn = new Inner(i);
        System.out.println("Creating inner " + inn.sInn);
        return inn;
    }

    @Override
    public String toString() {return "Outer-" + sOut;}
}
