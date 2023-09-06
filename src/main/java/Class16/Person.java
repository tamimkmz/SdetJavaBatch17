package Class16;

public class Person {
    private String name;// instance variable
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

    public Person(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
    public Person(String name, int age, double weight,char gender){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }

    public Person(String name, int age, double weight, char gender,
                  int salary, String hairColor) {
        this.name = name;// not assign to instance variable if we use the same type
        // name but we need to change them to this .name=name
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.salary = salary;
        this.hairColor = hairColor;


}
    public void printInfo(){
       String name="Giulia";
       // local variable and it always refers
       // to instance variable
       System.out.println(this.name+" "+age+" "+weight+" "+gender+" "+salary+" "+hairColor);


   }


   }


