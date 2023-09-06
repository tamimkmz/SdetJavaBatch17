package HomeWorkClasses;

import java.util.Scanner;

public class ClassHW {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();
        switch(country){
            case "Afghanistan":
                System.out.println("Dari");
                break;
            case "US":
                System.out.println("English");
                break;
            case "Iran":
                System.out.println("Farsi");
                break;
            case "Germany":
                System.out.println("German");
                break;
            case "India":
                System.out.println("Hindi");
                break;
            case "Pakistan":
                System.out.println("Urdo");
                break;
            default:
                System.out.println("country not supported");

        }
    }
}

