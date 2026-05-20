package homeworkpersoncomparison;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        Person other = (Person) obj;

        return this.name.equals(other.name)
                && this.age == other.age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
