import java.util.Comparator;

public class Comp2 implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2){
        int k = o2.bYear() - o1.bYear();
        if(k!=0) return k;
        k =  o1.name().compareToIgnoreCase(o2.name());
        if(k!=0) return k;
        return  o1.height() - o2.height();
    }

}
