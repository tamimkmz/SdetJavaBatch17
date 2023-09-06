
public class carMake {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.carColor="Black";
        obj1.carYear=2019;
        obj1.carMake="BMW";
        System.out.println("Car color is "+obj1.carColor+" and car year is "+obj1.carYear+" and car model is "+obj1.carMake);

                Car obj2 = new Car();
        obj2.carColor="White";
        obj2.carYear=2018;
        obj2.carMake="Toyota";
        System.out.println("Car color is "+obj2.carColor+" and car year is "+obj2.carYear+" and car model is "+obj2.carMake);
    }

}
class Car{
    String carColor;
    int carYear;
    String carMake;

}

