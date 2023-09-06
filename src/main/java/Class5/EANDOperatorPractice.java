package Class5;

import java.util.Scanner;

public class EANDOperatorPractice {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your person height in inches");// prompt the user
        double height=input.nextDouble(); // to enter person height in inches
        if (height<60) {
            System.out.println("short");
        } else if(height>=60&& height<=72){
            System.out.println("medium");
        }else{
            System.out.println("Tall");

        }


    }

    }

