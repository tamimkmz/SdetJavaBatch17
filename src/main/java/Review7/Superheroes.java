package Review7;

public class Superheroes { // this instance variable
    String name, power;// construction is block of code to initialize instance variable
    int age;
    char gender;

    Superheroes(String name, String power) {// this is the constructor
        this.name = name;
        this.power = power;
    }
    Superheroes(String name, String power,int age) {// this is constructor
        this(name, power);// this() ->making a call to the CURRENT class constructor
        this.age = age;//this. ->accessing CURRENT class instance variables
    }

    public static void main(String[] args) {
        Superheroes hero1=new Superheroes("Superman","Fly");

       Superheroes hero2= new Superheroes("Badman", "Money",27);

    }
}