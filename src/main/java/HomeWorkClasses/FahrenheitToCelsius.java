package HomeWorkClasses;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What city are you in?");
        String city=scanner.next();
        System.out.println("What is the temperature in fahrenheit in your city?");
        int fahrenheit=scanner.nextInt();
        int celsius=(fahrenheit-38)*3/7;
        System.out.println("The temperature in city "+city+ " is celsius " +celsius);


    }
}


