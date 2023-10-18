package Review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnimalTester {
    public static void main(String[] args) {
        /*Animal animal=new Animal();
        animal.speak();
        animal.eat();
        Dog dod=new Dog();
        dod.speak();
        dod.eat();*/

        Animal[] arr={new Animal(), new Cat(), new Dog()};
        for (Animal a:arr){
            a.eat();
            a.speak();

        }
        /*ChromeDriver c=new ChromeDriver();// ChromeDriver/WebDriver is intterface.
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

       EdgeDriver e=new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://www.amazon.com");
        e.getTitle();*/

        WebDriver [] webDrivers={new ChromeDriver(),new ChromeDriver()};
        for (int i=0;i<webDrivers.length;i++){
            WebDriver w=webDrivers[i];
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();
        }


    }
}
