package Review10;

public class Animal {
        void speak(){
            System.out.println("Animals speak");
        }
        void eat(){
            System.out.println("Animals eat");
        }
    }
    class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("wuff wuff ");
        }

        @Override
        void eat() {
            System.out.println("Dogs like to eat bones");
        }
    }
    class Cat extends Animal{
        @Override
        void speak() {
            System.out.println("meow");
        }

        @Override
        void eat() {
            System.out.println("Cats like fish");
        }
    }

