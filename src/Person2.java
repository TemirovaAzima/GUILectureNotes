import java.util.Arrays;
record Person2(String name, int year) {

    @Override
    public String toString() { return name + "(" + year + ")"; }

    static void show(Person2[] persons, String message) {
        IO.println(message + "\n" + Arrays.toString(persons));
    }
}

public static void main(String[] args) {
        Person2[] persons =
                { new Person2("Mary", 1990),
                        new Person2("Joan", 1992),
                        new Person2("Suzy", 1992),
                        new Person2("Beth", 1992),
                        new Person2("Suzy", 1980),
                        new Person2("Katy", 1982), };
        Person2.show(persons, "At the beginning:");

        // lambda as a single expression -
        // no return, no semicolon
        Arrays.sort(persons,
                (p1,p2) -> p2.year() -p1.year());
        Person2.show(persons,"Ordered by age only");

        // lambda as a compound statement -
        // return and semicolons, as usually
        Arrays.sort(persons, (p1, p2) ->
        {
            int d = p1.name().compareTo(p2.name());
            if (d != 0) return d;
            return p2.year() - p1.year();
        });
        Person2.show(persons, "Ordered by name then age");
    }
