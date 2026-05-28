package homeworkcity;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Armenia", "Shirak", "Gyumri"));
        cities.add(new City("Armenia", "Yerevan", "Yerevan"));
        cities.add(new City("Armenia", "Lori", "Vanadzor"));
        cities.add(new City("Armenia", "Syunik", "Goris"));
        cities.add(new City("Georgia", "Tbilisi", "Tbilisi"));
        cities.add(new City("Armenia", "Armavir", "Armavir"));

        for (City city : cities) {
            System.out.println(city);
        }

        Collections.sort(cities);

        for (City city : cities) {
            System.out.println(city);
        }

        City gyumri = new City("Armenia", "Shirak", "Gyumri");
        City ijevan = new City("Armenia", "Tavush", "Ijevan");

        System.out.println("Contains Gyumri " + cities.contains(gyumri));
        System.out.println("Contains Ijevan " + cities.contains(ijevan));
    }
}
