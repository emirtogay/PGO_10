package z1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        car c1 = new car("Aston Martin", 2020);
        car c2 = new car("Lamborghini", 2019);
        car c3 = new car("Ferrari", 2017);
        car c4 = new car("Bugatti", 2024);
        car c5 = new car("Bentley", 2024);
        car c6 = new car("Mazda", 2005);
        car c7 = new car("BMW", 2005);
        car c8 = new car("Volvo", 2016);
        car c9 = new car("Audi", 2002);
        car c10 = new car("Dodge", 2009);

        ArrayList<car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);
        for(car car : cars){
            System.out.println(car.toString());
        }
    }
}