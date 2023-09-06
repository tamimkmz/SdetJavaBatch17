package Class5;

import java.util.Scanner;

//Write a program for user to enter his/hers birth month. Based on the month define the season.
//Example: if user is born in March, April, May → season =”Spring”
//if user is born in June, July, August →
//season =”Summer”  etc …
//At the end of the program we should see 1 output as “You were born is season __”.
public class EORPractice1 {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String birthMonth=scanner.next();
        if( birthMonth.equalsIgnoreCase("Mar")||
            birthMonth.equalsIgnoreCase("Apr")||
            birthMonth.equalsIgnoreCase("May")


                ) {
            System.out.println("Spring");
        }else if(birthMonth.equalsIgnoreCase("Jun")||
                birthMonth.equalsIgnoreCase("Jul")||
                birthMonth.equalsIgnoreCase("Aug")){
            System.out.println("Summer");

        }



    }
}
