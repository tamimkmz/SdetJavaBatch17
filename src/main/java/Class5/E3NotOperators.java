package Class5;

import java.util.Scanner;

public class E3NotOperators {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the country");
        String country=input.nextLine();
        if (!country.equals("(Iran")){
            System.out.println("Welcome, your are allowed");

        }
    }
}
