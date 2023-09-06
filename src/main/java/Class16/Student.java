package Class16;

public class Student {
    private String name;
    private String address;

    public Student(String name,String address){
    this.name=name;
    this.address=address;

    }
    public void displayInfo(){
        System.out.println("Student name is "+name+" and address is "+address);

    }

    public static void main(String[] args) {
        Student s1=new Student("Tamim", "10210 San Diego");
        s1.displayInfo();

    }
}
