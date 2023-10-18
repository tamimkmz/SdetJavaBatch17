package Review9;

public class Parent {
    String name = "James";

    void printHello() {
        System.out.println("Hello Word");

    }

    Parent() {
        System.out.println("Parent class constructor");
    }

    Parent(String n) {
        System.out.println("Parent class with parameter");
    }

    static class Child extends Parent {// when we use inheritance it must be same name variable in child and parent class
        String name = "John";

        void printHello() {
            System.out.println("Hello Java");
        }

        void test() {
            String name = "White";
            System.out.println(super.name);//whenever we write super we interest to parent class
            // super means everything from parent
            System.out.println(this.name);
            System.out.println(name);// priority is first for local/ instance then parent

        }

        void methodTest() {
            super.printHello();
        }

        public Child() {// when we call something from parent class
    super("name");// if remove name it print first parent only
        }
    }
}
