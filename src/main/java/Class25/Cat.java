package Class25;

import java.util.LinkedList;

public class Cat {

        private String name;
        private int age;
        private String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Color: " + color);
            System.out.println();
        }



        public static void main(String[] args) {
            // Create three Cat objects
            Cat cat1 = new Cat("lorki", 2, "green");
            Cat cat2 = new Cat("buby", 3, "Black and White");
            Cat cat3 = new Cat("Luve", 4, "brown");

            // Create a LinkedList to store Cat objects
            LinkedList<Cat> cats = new LinkedList<>();

            cats.add(new Cat("Tom,",10, "Grey"));
            cats.add(new Cat("Sam", 12, "Brown"));
            cats.add(new Cat("Nagi", 12, "Orange and White"));

      /*  for (Cat cat : cats) {
            cat.printInfo();
        }*/
            cats.forEach(x->x.printInfo());
        }
    }


