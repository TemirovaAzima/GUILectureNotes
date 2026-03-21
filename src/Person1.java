public class Person1 implements Comparable<Person1>{
    private String name;
    private int year;

    public Person1(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Person1 other) {
        int diff = year - other.year;
        if(diff !=0) return diff;
        else return name.compareTo(other.name);
    }

    public String getName(){ return  name; }
    public int getYear() { return year;}

    @Override
    public String toString(){
        return name + "(" + year + ")";
    }

    static void show(Person1[] persons, String message){
        System.out.println(message);
        for(Person1 person : persons)
            System.out.print(person +" ");
        System.out.println("\n");
    }
}