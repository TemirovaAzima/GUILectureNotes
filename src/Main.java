import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] list = {
                new Person("K", 2000, 165),
                new Person("B", 2006, 171),
                new Person("K", 2000, 168),
                new Person("H", 2000, 171),
                new Person("M", 2002, 173),
                new Person("K", 1999, 169),
        };

        Arrays.sort(list);
        writeL(list, "Natural: name,age,height");

        Arrays.sort(list, new Comp1());
        writeL(list, "Comp1: height, age, name,");

        Comparator<Person> comp2 = new Comp2();
        Arrays.sort(list, comp2);
        writeL(list, "Comp1:  age, name, height,");


        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p, Person q) {
                // Compare by name (case-insensitive)
                int k = p.name().compareToIgnoreCase(q.name());
                if (k != 0) return k;
                // If names are the same, compare by height
                k = p.height() - q.height();
                if (k != 0) return k;
                // If heights are the same, compare by birth year (descending/age ascending)
                return q.bYear() - p.bYear();
            }
        });
        writeL(list, "Anonym: name,height,age");

        // lambda
        Arrays.sort(list, (f, s) -> s.height() - f.height());
        writeL(list, "Lambda: height, descending");

        // another way to do

        Person1[] persons = {
                new Person1("Mary", 1990),
                new Person1("Joan", 1992),
                new Person1("Suzy", 1992),
                new Person1("Beth", 1992),
                new Person1("Suzy", 1980),
                new Person1("Katy", 1982),
        };

        Person1.show(persons,"At the beginning:");

        // Sort using Comparable (natural order)
        Arrays.sort(persons);
        Person1.show(persons,"Natural order: \" +\n" +
                "  \"by age, then name\"" );

        // Sort using custom Comparator: Name then Age
        Arrays.sort(persons,new CompPerson(CompPerson.NAME_AGE));
        Person1.show(persons, "Order NAME_AGE: " +
                "by name, then age");

        // Sort using custom Comparator: Name Reversed then Age

        Arrays.sort(persons,
                new CompPerson(CompPerson.NAMERev_AGE));
        Person1.show(persons, "Order NAMERev_AGE: " +
                "by name reversed, then age");

        // Sort using custom Comparator: Age then Name
        Arrays.sort(persons,
                new CompPerson(CompPerson.AGE_NAME));
        Person1.show(persons, "Order AGE_NAME: " +
                "by age, then name");

        // Sort using custom Comparator: Age then Name Reversed
        Arrays.sort(persons,
                new CompPerson(CompPerson.AGERev_NAME));
        Person1.show(persons, "Order AGERev_NAME: " +
                "by age reversed, then name");

        // Sort using Lambda expression
        Arrays.sort(persons, (f,s) -> f.getYear() - s.getYear() !=0
                                                  ? f.getYear() - s.getYear()
                                                  : s.getName().compareTo(f.getName()));

        Person1.show(persons, "Order by lambda : " +
                "by age descending, then name descending");

        Outer out1 = new Outer("out1");
        Outer.Inner inn1 = out1.getInner("inn1");
        Outer.Inner inn2 = new Outer.Inner("hello");
//        Outer.Inner inn2 = out1.new Inner("inn2");
        System.out.println("hehe");
        System.out.println(out1);
        System.out.println(inn1);
        System.out.println(inn2);
        System.out.println("hehe");
        System.out.println(out1.getClass().getName());
        System.out.println(inn1.getClass().getName());
        System.out.println(inn2.getClass().getName());


        // Stack
        MyStack stInt = new MyStack();
        for(int i = 5; i>0; i--)
            stInt.push(i);
        while (!stInt.empty())
            System.out.println(stInt.pop() + " ");
        System.out.println();
        BiIntOperator[] opers = {
                // objects of concrete classes
                // implementing an interface
                new AddAndMult(2),
               new MultAndAdd(5),
                // object of anonymous class
                // implementing an interface
                new BiIntOperator(){
                    @Override
                    public int apply(int i, int j){
                        return  i*i + j*j;
                    }
                },
                // object of anonymous class
                // extending a regular class
                new MultAndAdd(3){
                    @Override
                    public int apply(int i , int j){
                        return seed*(i*i + j*j);
                    }
                }
        };
        int a = 1, b =2;
        for (BiIntOperator op : opers)
            System.out.print(op.apply(a,b) + " ");
        System.out.println();
        Animal max = new Animal("Max",15) {
            @Override
            public String speak() {
                return "bow-wow";
            }
        };

        Animal[] animals = {
                max,
                new Animal("Batty",3.5) {
                    @Override
                    public String speak() {
                        return "miaou-miaou";
                    }
                }
        };
        for(Animal t: animals)
            System.out.println(t);
    }

    static void writeL(Person[] list, String header) {
        System.out.println('\n' + header);
        for (Person p : list) System.out.print(p + " ");
        System.out.println();
    }
}
