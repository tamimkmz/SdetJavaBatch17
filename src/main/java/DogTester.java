public class DogTester {

    public static void main(String[] args) {
        // we are creating an object from the dog class
        Dog LunasObj=new Dog();
        LunasObj.name="Lunas";
        LunasObj.gender='F';
        LunasObj.breed="Shiba";
        LunasObj.weight=10;
        LunasObj.age=20;
        System.out.println(LunasObj.name);
        System.out.println(LunasObj.age);
        System.out.println(LunasObj.breed);

        // we are calling bark method on LunasObj
        LunasObj.bark();
        // we are calling eat method on LunasObj
        LunasObj.eat();
        // we are calling sleep method on LunasObj
        LunasObj.sleep();



    }
}
