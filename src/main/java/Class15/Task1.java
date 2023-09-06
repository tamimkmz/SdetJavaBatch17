package Class15;



public class Task1 {
  public Task1(String name){

        System.out.println("executed constructors with parameter"+name);
  }
    Task1(){
        System.out.println("executed constructor without parameter");
    }
public static void main(String[] args){
    new Task1();
    new Task1(" Canada");
    }
}