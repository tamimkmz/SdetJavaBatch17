package Class18;

 public class GrandParent {
    public GrandParent(){
        System.out.println("GrandParent");
    }
}
class Parent extends GrandParent{
    public Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {
        Child c=new Child();
    }
}