package Class18;
class GrandPa{
    String color="white";
}
public class Furniture extends GrandParent {
    String color="Black";
}
class Chair extends Furniture{
    String color="brown";
    void printInfo(){
        String color="blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printInfo();

    }
}