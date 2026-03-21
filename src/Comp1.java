import java.util.Comparator;

public class Comp1 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int k = o1.height() - o2.height();
        if(k!=0) return k;
        k = o2.bYear() - o1.bYear();
        if(k!=0) return k;
        return o1.name().compareToIgnoreCase(o2.name());
    }
}
