        package Class24;

        /* create an arrayList of fruit then remove all the fruit which contains
         the letter a or ends with the letter e */
        import java.util.ArrayList;

        public class T6 {
            public static void main(String[] args) {

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Peach");
        fruits.removeIf(d->d.contains("a")|| d.endsWith("e"));
        System.out.println(fruits);
       // fruits.stream().

    }
}

