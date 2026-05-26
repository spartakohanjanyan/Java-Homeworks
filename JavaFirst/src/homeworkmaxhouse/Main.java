package homeworkmaxhouse;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {4, 9, 2, 15, 7};

        Integer maxNumber = MaxFinder.findMax(numbers);

        System.out.println("Max number = " + maxNumber);


        House[] houses = {
                new House("Vanqi Tap", 120),
                new House("Komitas", 250),
                new House("Cheremushka", 180)
        };

        House biggestHouse = MaxFinder.findMax(houses);

        System.out.println("Biggest house = " + biggestHouse);
    }
}
