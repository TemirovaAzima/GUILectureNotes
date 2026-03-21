import java.util.Comparator;

public class CompPerson implements Comparator<Person1>{
    public static final int NAME_AGE = 0,
                            AGE_NAME = 1,
                            NAMERev_AGE = 2,
                            AGERev_NAME = 3;
    private int comp;

    public CompPerson(int comp){
        this.comp = comp;
    }


    @Override
    public int compare(Person1 p1, Person1 p2) {
        int rYear = p1.getYear() - p2.getYear();
        int rName = p1.getName().compareTo(p2.getName());

        return switch (comp){
            case NAME_AGE -> rName !=0 ? rName : -rYear;
            case AGE_NAME -> rYear !=0 ? -rYear : rName;
            case NAMERev_AGE -> rName !=0 ? -rName : -rYear;
            case AGERev_NAME -> rYear !=0 ? rYear : rName;
            default ->
                throw new IllegalArgumentException("Illegal comp");
        };
    }
}