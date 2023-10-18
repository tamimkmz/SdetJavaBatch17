package Review10;

public class Car implements Washable{

    public void drive() {
        System.out.println("driving .......");
    }


    @Override
    public void wash() {
        System.out.println("You can take your car to car wash");

    }
}
class Horse implements Washable{

    @Override
    public void wash() {
        System.out.println("Horse can wash themself");

    }
}