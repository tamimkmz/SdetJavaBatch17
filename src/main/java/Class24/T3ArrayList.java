package Class24;
/*
Create an arrayList of drinks call it. If any drink has letter “a”
or “e” replace the whole word with water.
 */
import java.util.ArrayList;

public class T3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("apple juice");
        drinks.add("mango juice");
        drinks.add("banana J");
        drinks.add("kewi J");

        for (int i = 0; i < drinks.size(); i++) {
           String drink=drinks.get(i);

            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "water");
// extra concept if (drink.contains("a") || drinks.contains("e"){drinks.set("water");}
            }
        }
        System.out.println(drinks);
    }}