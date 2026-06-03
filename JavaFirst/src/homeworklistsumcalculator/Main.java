package homeworklistsumcalculator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(14);
        intNumbers.add(21);
        intNumbers.add(38);

        System.out.println("Integer ArrayList sum = " + ListSumCalculator.sumNumbers(intNumbers));


        ArrayList<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(2.4);
        doubleNumbers.add(3.5);
        doubleNumbers.add(4.3);

        System.out.println("Double ArrayList sum = " + ListSumCalculator.sumNumbers(doubleNumbers));


        LinkedList<Float> floatNumbers = new LinkedList<>();
        floatNumbers.add(1.5f);
        floatNumbers.add(2.4f);
        floatNumbers.add(3.1f);

        System.out.println("Float LinkedList sum = " + ListSumCalculator.sumNumbers(floatNumbers));
    }
}
