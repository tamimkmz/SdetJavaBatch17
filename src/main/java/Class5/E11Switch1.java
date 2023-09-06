package Class5;

import java.util.Scanner;

//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
public class E11Switch1 {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();
        switch(country){
            case "AFG":
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
            default:
                System.out.println("country not supported");

        }
    }
}
