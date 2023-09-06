package Class16;

public class Cat {
    private String name;
    private int age;
    private String color;
    private char gender;

    public void printInfo() {
        System.out.println(name + " " + age + " " + color + " " + " " + gender);
    }

    public Cat(String name, int age, String color, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;

    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }
}