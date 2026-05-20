package homeworkpersoncomparison;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {4, 7, 2, 9};

        System.out.println(Finder.contains(numbers, 7));

        System.out.println(Finder.contains(numbers, 10));


        Person[] people = {
                new Person("Karen", 20),
                new Person("Anna", 25),
                new Person("Gor", 30)
        };

        Person target = new Person("Anna", 25);

        System.out.println(Finder.contains(people, target));
    }
}
