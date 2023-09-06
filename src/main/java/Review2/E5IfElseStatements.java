package Review2;

import java.util.Scanner;

public class E5IfElseStatements {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter you age to calculator the discount");
        int age =60;
        /*
        if age>60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount

         */
        if(age>60) {
            System.out.println(" you get 20% discount");
        }else if(age >50) {
            System.out.println(" you get 15% discount");
        }else if (age>40) {
            System.out.println(" you get 10% discount");
        }else {
            System.out.println(" no discount for you.please try after 10 years");

        }
    }
}
