public record Person(String name,int bYear,int height) implements Comparable<Person> {
    final static int currYear;
    static {
        //
        currYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    }

    // COMPACT CONSTRUCTOR
    public Person{
        if(bYear > currYear) throw new IllegalArgumentException(String.format("bYear({}) > currYear({})",bYear,currYear));
        if(height > 230 || height<30 ) throw new IllegalArgumentException(String.format("Invalid height: {}",height));
    }

    @Override
    public int compareTo(Person o) {
       int k = name.compareToIgnoreCase(o.name);
       if(k !=0) return k;
       k = o.bYear - bYear;
       if(k !=0) return k;
       return height - o.height;
    }

    @Override
    public String toString(){
        return name + "(" + (currYear-bYear) +
                "/" + height + ")";
    }
}
