package Class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverTester {

    public static void main(String[] args) throws InterruptedException {
        //WebDriver w = new ChromeDriver();
        WebDriver w = new EdgeDriver();
        WebDriver[] browsers={new ChromeDriver(),new EdgeDriver()};
        for(WebDriver W:browsers){

        w.manage().window().maximize();
        Thread.sleep(2000);
        w.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println(w.getTitle());
        Thread.sleep(2000);
        w.close();

    }
}}