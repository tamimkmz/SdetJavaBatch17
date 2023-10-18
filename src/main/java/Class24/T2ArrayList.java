package Class24;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("labo");
        cars.add("chevy");
        cars.add("toyota");
        cars.add("Honda");
        cars.add("benz");
        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("*");// second way

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
